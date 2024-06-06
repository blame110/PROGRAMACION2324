package unidad4;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import unidad4.model.ClienteDAO;
import unidad4.model.ClienteDO;
import unidad4.utils.UtilsBD;

public class EjemploMenuExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int opcion = -1;
		// Nos conectamos a BD
		Connection con = UtilsBD.conectarBD();

		while (opcion != 3) {

			// Mostramos el menu
			System.out.println("1. Insertar Cliente\n2. Borrar Cliente\n3.Salir ");

			// Leemos la opcion
			opcion = teclado.nextInt();

			// Dependiendo de la opcion que leemos de
			// teclado hacemos
			// Una u otra accion
			switch (opcion) {

			case 1:
				// Insertar Cliente
				// leemos los datos del cliente

				System.out.println("Introduce el id del cliente:(-1 si quieres autoincremental)");
				int id = teclado.nextInt();
				System.out.println("Introduce el nombre del cliente:");
				String nombre = teclado.next();
				System.out.println("Introduce el apellido del cliente:");
				String apellido = teclado.next();
				System.out.println("Introduce la edad del cliente:");
				int edad = teclado.nextInt();
				System.out.println("Introduce el sexo del cliente:");
				String sexo = teclado.next();
				System.out.println("Introduce el email del cliente:");
				String email = teclado.next();
				System.out.println("Introduce el password del cliente:");
				String password = teclado.next();

				ClienteDO cliente = new ClienteDO(id, nombre, apellido, edad, sexo.charAt(0), email, password);

				// Insertamos en BD el cliente
				ClienteDAO.insertCliente(con, cliente);

				break;

			case 2:
				// Borrar Cliente
				System.out.print("Introduce el id del Cliente a Borrar:");
				// Leemos el idCliente a borrar
				int idCliente = teclado.nextInt();

				ClienteDAO.removeCliente(con, idCliente);

				break;

			case 3:
				System.out.println("Programa finalizado");
				break;

			default:
				System.out.println("Opción no valida, introduzca un valor entre 1 y 3.");

			}

		}

		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		teclado.close();
	}

}
