package unidad4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

	/**
	 * Recibe la conexion y un idCliente y devuelve un
	 * resulset con los datos de ese id
	 * 
	 * @param con
	 * @param idCliente
	 * @return
	 */
	public static ResultSet getCliente(Connection con, int idCliente) {

		try {

			// Creamos la sentencia a ejecutar
			String query = "SELECT * FROM CLIENTE WHERE idCliente=?";

			// Primer paso creo un statement
			PreparedStatement pstmt = con.prepareStatement(query);

			// Asignamos el valor del idCliente a la
			// interrogacion
			pstmt.setInt(1, idCliente);

			// Ejecutamos la query y los resultados
			// quedan en el resulset
			ResultSet rs = pstmt.executeQuery();

			// devolvemos el resulset
			return rs;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;

		}

	}

	public static int removeCliente(Connection con, int idCliente) throws SQLException {

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
			con.rollback();
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
			String query = "INSERT INTO cliente (nombre, apellidos, edad, sexo, email,password) VALUES(?,?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setString(1, cliente.getNombre());
			pstmt.setString(2, cliente.getApellidos());
			pstmt.setInt(3, cliente.getEdad());
			pstmt.setString(4, String.valueOf(cliente.getSexo()));
			pstmt.setString(5, cliente.getEmail());
			pstmt.setString(6, cliente.getPassword());

			// Ejecutamos la query
			numAff = pstmt.executeUpdate();

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

			boolean campoPrevio = false;
			int numAff = -1;
			String query = "UPDATE CLIENTE SET ";

			// Si los campos no son nulos, los vamos
			// añadiendo a la sentencia
			if (cliente.getNombre() != null) {
				query = query + "nombre = ?";
				campoPrevio = true;
			}

			if (cliente.getApellidos() != null) {
				if (campoPrevio) {
					query = query + ", ";
				}
				query = query + "apellidos = ?";
				campoPrevio = true;
			}

			if (cliente.getEdad() != -1) {
				if (campoPrevio) {
					query = query + ", ";
				}
				query = query + "edad = ?";
				campoPrevio = true;
			}

			if (cliente.getSexo() != ' ') {
				if (campoPrevio) {
					query = query + ", ";
				}
				query = query + "sexo = ?";
				campoPrevio = true;
			}

			if (cliente.getEmail() != null) {
				if (campoPrevio) {
					query = query + ", ";
				}
				query = query + "email = ?";
				campoPrevio = true;
			}

			if (cliente.getPassword() != null) {
				if (campoPrevio) {
					query = query + ", ";
				}
				query = query + "password = ?";
			}

			query = query + " WHERE idCliente = ?";

			// Generamos el preparedstatement con la
			// query
			PreparedStatement pstmt = con.prepareStatement(query);

			// Enlazamos los datos a las ? del prepared
			// statement

			int posInterrogacion = 1;

			// Si los campos no son nulos, los vamos
			// añadiendo a la sentencia
			if (cliente.getNombre() != null) {

				pstmt.setString(posInterrogacion, cliente.getNombre());
				// Incrementamos la posicion de la
				// interrogacion para
				// El siguiente posible campo
				posInterrogacion++;
			}

			if (cliente.getApellidos() != null) {
				pstmt.setString(posInterrogacion, cliente.getApellidos());
				// Incrementamos la posicion de la
				// interrogacion para
				// El siguiente posible campo
				posInterrogacion++;

			}

			if (cliente.getEdad() != -1) {
				pstmt.setInt(posInterrogacion, cliente.getEdad());
				// Incrementamos la posicion de la
				// interrogacion para
				// El siguiente posible campo
				posInterrogacion++;

			}

			if (cliente.getSexo() != ' ') {
				pstmt.setString(posInterrogacion, String.valueOf(cliente.getSexo()));
				// Incrementamos la posicion de la
				// interrogacion para
				// El siguiente posible campo
				posInterrogacion++;

			}

			if (cliente.getEmail() != null) {
				pstmt.setString(posInterrogacion, cliente.getEmail());
				// Incrementamos la posicion de la
				// interrogacion para
				// El siguiente posible campo
				posInterrogacion++;
			}

			if (cliente.getPassword() != null) {
				pstmt.setString(posInterrogacion, cliente.getPassword());
				// Incrementamos la posicion de la
				// interrogacion para
				// El siguiente posible campo
				posInterrogacion++;
			}

			pstmt.setInt(posInterrogacion, cliente.getIdCliente());

			if (campoPrevio) {

				System.out.println(query);

				numAff = pstmt.executeUpdate();

			}

			return numAff;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return ERROR_SQL_BORRAR;
		}
	}

}
