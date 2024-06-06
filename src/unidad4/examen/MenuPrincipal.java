package unidad4.examen;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcion = -1;
		Connection con = UtilsBD.conectarBD();

		// TODO Auto-generated method stub
		do {

			System.out.println("**** Bienvenido a PuertoSanta ****\r\n" + "****     Administración   *******\r\n"
					+ "\r\n" + "1. Insertar Barco\r\n" + "2. Mostrar Barcos\r\n" + "3, Eliminar Barco\r\n" + "\r\n"
					+ "4. Salir\r\n" + "\r\n" + "Opción (1-4):\r\n" + "");

			// Leemos la opcion elegida
			opcion = teclado.nextInt();
		} while (opcion > 4 || opcion < 1);

		// Dependiendo de la opcion realizaremos
		// La accion elegida
		switch (opcion) {
		case 1:
			insertarBarco(con, teclado);
			break;
		case 2:
			mostrarMenu(con, teclado);
			break;
		case 3:
			borrarBarco(con, teclado);
			break;
		case 4:
			return;
		}

	}

	private static void borrarBarco(Connection con, Scanner teclado) {

		// Pedimos por teclado el id del barco a borrar
		System.out.print("Que barco quieres borrar?(id);");
		int idBarco = teclado.nextInt();

		// llamamos a la funcion de borrado
		int resultado = BarcoDAO.borrar(con, idBarco);

		if (resultado == 1)
			System.out.println("Se ha borrado correctamente");
		else
			System.out.println("Ha habido un problema al borrar");

	}

	private static void insertarBarco(Connection con, Scanner teclado) {

		// Vamos leyendo los datos
		System.out.println("Introduce el id del barco");
		int idBarco = teclado.nextInt();
		System.out.println("Nombre del Barco;");
		String nombre = teclado.next();
		System.out.println("Descripcion del barco:");
		String descripcion = teclado.next();
		System.out.println("Categoria del Barco(1-VELERO, 2-GALEON):");
		int categoria = teclado.nextInt();
		System.out.println("Eslora:");
		int eslora = teclado.nextInt();
		System.out.println("Es de competicion(1-si, 0-no)");
		int competicion = teclado.nextInt();
		System.out.println("Peso:");
		int peso = teclado.nextInt();
		System.out.println("Precio:");
		int precio = teclado.nextInt();
		System.out.println("Id Cliente:");
		int idCliente = teclado.nextInt();

		// Compruebo si existe el barco que se quiere
		// insertar
		ResultSet rs = BarcoDAO.getBarco(con, idBarco);
		// Si hay registros implica que en bd ya hay un
		// barco con ese id
		try {
			if (rs.next()) {
				System.out.println("El barco ya esta en BD");
				return;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// boolean esCompeticion;
		// if (competicion==1) esCompeticion=true; else
		// esCompeticion=false;

		BarcoDO barco = new BarcoDO(idBarco, nombre, descripcion, categoria, eslora, (competicion == 1 ? true : false),
				peso, precio, idCliente);

		// Insertamos en BD el barco
		int resultado = BarcoDAO.insertar(con, barco);

		if (resultado == 1)
			System.out.println("Se ha insertado correctamente");
		else
			System.out.println("Ha habido un problema al insertar");

	}

	public static void mostrarMenu(Connection con, Scanner teclado) {

		int opcion = -1;
		ResultSet rs;
		// TODO Auto-generated method stub
		do {

			System.out.println("1 Mostrar todos ordenados por...\r\n" + "2 Mostrar los de eslora superior a…\r\n"
					+ "3 Salir\r\n" + "\r\n" + "Opción (1-3):\r\n" + "");

			// Leemos la opcion elegida
			opcion = teclado.nextInt();
		} while (opcion > 3 || opcion < 1);

		switch (opcion) {
		case 1:
			// Leemos el campo por el que ordenaremos
			int campoOrden = -1;
			System.out.println("Por que campo quieres que ordene (1-Id,2-Nombre,3-Eslora)");
			campoOrden = teclado.nextInt();

			// Cargamos todos los barcos ordenados
			rs = BarcoDAO.getBarcosOrdenados(con, campoOrden);

			// Recorremos todos los registros del
			// resultset
			try {
				while (rs.next()) {
					System.out.print("Nombre: " + rs.getString("nombre"));
					System.out.println(" Descripcion: " + rs.getString("descripcion"));
					System.out.println(" Eslora: " + rs.getInt("eslora"));

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case 2:
			System.out.println("Cual es la eslora mínima:");
			int eslora = teclado.nextInt();

			// Cargamos todos los barcos ordenados
			rs = BarcoDAO.getBarcosEsloraSup(con, eslora);

			// Recorremos todos los registros del
			// resultset
			try {
				while (rs.next()) {
					System.out.print("Nombre: " + rs.getString("nombre"));
					System.out.print(" Descripcion: " + rs.getString("descripcion"));
					System.out.print(" Eslora: " + rs.getInt("eslora"));
					System.out.println(" Puerto: " + rs.getString("nombre_puerto"));

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		}
	}

}
