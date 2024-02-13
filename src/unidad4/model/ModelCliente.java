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

	public static int removeCliente(Connection con, String email) {

		try {
			// Primer paso creo un statement
			Statement stmt = con.createStatement();

			// Ejemplo de borrado
			int numAff = stmt.executeUpdate("DELETE FROM CLIENTE WHERE email=" + email);

			// Devolvemos el numero de columnas
			// afectadas
			return numAff;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR_SQL_BORRAR;

		}
	}

	/**
	 * Inserta en BD los datos del cliente
	 * 
	 * @param con
	 * @param cliente
	 * @return
	 */
	public static int insertCliente(Connection con, ClienteDO cliente) {

		try {

			int numAff = ERROR_SQL_BORRAR;

			// Creamos la query con los datos del
			// cliente
			String query = "INSERT INTO cliente (nombre, apellidos, edad, sexo, email,password) VALUES('"
					+ cliente.getNombre();
			query += "','" + cliente.getApellidos();
			query += "'," + cliente.getEdad();
			query += ",'" + cliente.getSexo();
			query += "','" + cliente.getEmail();
			query += "','" + cliente.getPassword() + "')";

			Statement stmt = con.createStatement();

			// Ejecutamos la query
			numAff = stmt.executeUpdate(query);

			return numAff;

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return ERROR_SQL_BORRAR;
		}

	}

	/**
	 * Funcion que recibe un clienteDO y modifica los
	 * campos del cliente que no sean nulos
	 *
	 * @param con
	 * @param cliente
	 * @return
	 */
	public static int updateCliente(Connection con, ClienteDO cliente) {
		try {
			Statement stmt = con.createStatement();

			boolean campoPrevio = false;
			int numAff = -1;
			String query = "UPDATE CLIENTE SET ";

			// Si los campos no son nulos, los vamos
			// añadiendo a la sentencia
			if (cliente.getNombre() != null) {
				query = query + "nombre = '" + cliente.getNombre() + "'";
				campoPrevio = true;
			}

			if (cliente.getApellidos() != null) {
				if (campoPrevio) {
					query = query + ", ";
				}
				query = query + "apellidos = '" + cliente.getApellidos() + "'";
				campoPrevio = true;
			}

			if (cliente.getEdad() != -1) {
				if (campoPrevio) {
					query = query + ", ";
				}
				query = query + "edad = " + cliente.getEdad();
				campoPrevio = true;
			}

			if (cliente.getSexo() != ' ') {
				if (campoPrevio) {
					query = query + ", ";
				}
				query = query + "sexo = '" + cliente.getSexo() + "'";
				campoPrevio = true;
			}

			if (cliente.getEmail() != null) {
				if (campoPrevio) {
					query = query + ", ";
				}
				query = query + "email = '" + cliente.getEmail() + "'";
				campoPrevio = true;
			}

			if (cliente.getPassword() != null) {
				if (campoPrevio) {
					query = query + ", ";
				}
				query = query + "password = '" + cliente.getPassword() + "'";
			}

			query = query + " WHERE idCliente = " + cliente.getIdCliente();
			if (campoPrevio) {

				System.out.println(query);
				numAff = stmt.executeUpdate(query);

			}

			return numAff;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return ERROR_SQL_BORRAR;
		}
	}

}
