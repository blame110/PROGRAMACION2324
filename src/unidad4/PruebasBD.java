package unidad4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import unidad4.model.ClienteDO;
import unidad4.model.ModelCliente;
import unidad4.model.ModelFactura;
//Con este import podemos usar todas las clases del paquete utils
import unidad4.utils.UtilsBD;

public class PruebasBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Intentamos conectar con BD");
		// Ejecutamos la funcion de conexion
		Connection con = UtilsBD.conectarBD();

		try {

			// Primer paso creo un statement
			Statement stmt = con.createStatement();

			// Ejecutamos la query y los resultados
			// quedan en el resulset
			// ResultSet rs = stmt.executeQuery("SELECT
			// * FROM CLIENTE");

			ResultSet rs = ModelCliente.getClientes(con);

			// Getfetchsize
			System.out.println("Hay " + rs.getFetchSize() + " registros");

			// Recorremos todos los elementos de la
			// query resultante
			while (rs.next()) {
				System.out.print("Nombre: " + rs.getString("nombre"));
				System.out.print(" Edad: " + rs.getInt("edad"));
				System.out.println(" Sexo: " + rs.getString(5));
			}

			/**
			 * Funciones interesantes con resulset
			 * rs.previous() hacia atras
			 * rs.getFetchSize() cantidad de elementos
			 * rs.beforeFirst() lo mueve al principio
			 * rs.afterLast() lo mueve al final
			 * rs.getArray(column) devuelve todos los
			 * datos de una columna en un array
			 */

			// Modificacion
			// int numAff = stmt.executeUpdate("UPDATE
			// CLIENTE SET EDAD=EDAD+1 WHERE
			// SEXO='M'");

			int idCliente = 3;
			ClienteDO cliente = new ClienteDO(idCliente, "jorge", "Perlitas56", 119, ' ', null, "toitoto");

			ClienteDO clienteLuismi = new ClienteDO(idCliente, "LuisMi", "Toscano", 19, 'M', "emailluis@gmail.com",
					"toitoto");

			ClienteDO clienteJuanma = new ClienteDO(idCliente, "Juanmanuel", "Toscano", 13, 'M',
					"emaildfaluis@gmail.com", "toitoto");

			int numAff = ModelCliente.updateCliente(con, cliente);

			System.out.println("Se han modificado " + numAff + " columnas");

			// Ejemplo de borrado
			// numAff = stmt.executeUpdate("DELETE FROM
			// CLIENTE WHERE idCliente=1");
			// numAff = ModelCliente.removeCliente(con,
			// 5);

			System.out.println("Se han borrado " + numAff + " columnas");

			// Insercion de registros
			// numAff = stmt.executeUpdate(
			// "INSERT INTO cliente
			// VALUES(1,'Patricia','bueno',61,'F','enim.mi.tempor@icloud.net','OFO48CRF5IB')");

			numAff = ModelCliente.insertCliente(con, clienteJuanma);

			System.out.println("Se han insertado " + numAff + " columnas");

			// Cargamos las facturas del cliente
			rs = ModelFactura.getFacturaCliente(con, 38);

			// Recorremos todos los elementos de la
			// query resultante
			while (rs.next()) {
				System.out.print("Nombre Empresa: " + rs.getString("nombreEmpresa"));
				System.out.print(" idCliente: " + rs.getInt("idCliente"));
				System.out.println(" Cif: " + rs.getString(2));
			}

			rs = ModelCliente.getCliente(con, 18);
			// Nos posicionamos en el primer registro
			rs.next();
			// Sacamos los datos del cliente 18
			System.out.print("Nombre: " + rs.getString("nombre"));
			System.out.print(" Edad: " + rs.getInt("edad"));
			System.out.println(" Sexo: " + rs.getString(5));

			// Cerramos la conexion
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
