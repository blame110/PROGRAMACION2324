package unidad4.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelCliente {

	public static final int ERROR_SQL_BORRAR = -1;

	/**
	 * La funcion recibe una conexion y devuelve los
	 * datos de todos los clientes
	 * 
	 * @param con
	 * @return un resulset con los datos de los
	 *         clientes o nulo si hay problemas
	 */
	public static ResultSet getClientes(Connection con) {

		try {

			// Primer paso creo un statement
			Statement stmt = con.createStatement();

			// Ejecutamos la query y los resultados
			// quedan en el resulset
			ResultSet rs = stmt.executeQuery("SELECT * FROM CLIENTE");

			// devolvemos el resulset
			return rs;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;

		}

	}

	public static int removeCliente(Connection con, int idCliente) {

		try {
			// Primer paso creo un statement
			Statement stmt = con.createStatement();

			// Ejemplo de borrado
			int numAff = stmt.executeUpdate("DELETE FROM CLIENTE WHERE idCliente=" + idCliente);

			// Devolvemos el numero de columnas
			// afectadas
			return numAff;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR_SQL_BORRAR;

		}
	}

}
