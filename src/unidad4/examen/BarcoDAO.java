package unidad4.examen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BarcoDAO {

	/**
	 * Recibe la conexion y un idCliente y devuelve un
	 * resulset con los datos de ese id
	 * 
	 * @param con
	 * @param idCliente
	 * @return
	 */
	public static ResultSet getBarco(Connection con, int idBarco) {

		try {

			// Creamos la sentencia a ejecutar
			String query = "SELECT * FROM BARCOS WHERE idBarcos=?";

			// Primer paso creo un statement
			PreparedStatement pstmt = con.prepareStatement(query);

			// Asignamos el valor del idCliente a la
			// interrogacion
			pstmt.setInt(1, idBarco);

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

	public static ResultSet getBarcosEsloraSup(Connection con, int eslora) {

		try {

			// Creamos la sentencia a ejecutar
			String query = "SELECT b.*, p.nombre as nombre_puerto FROM barcos b inner join anclado a on b.idbarcos=a.barcos_idbarcos"
					+ " inner join puerto p on a.puerto_idpuerto=p.idpuerto WHERE eslora>?";

			// Primer paso creo un statement
			PreparedStatement pstmt = con.prepareStatement(query);

			// Asignamos el valor del idCliente a la
			// interrogacion
			pstmt.setInt(1, eslora);

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

	public static ResultSet getBarcosOrdenados(Connection con, int campo) {

		try {

			// Creamos la sentencia a ejecutar
			String query = "SELECT * FROM BARCOS order by ";

			switch (campo) {
			case 1:
				query = query + "idBarcos";
				break;
			case 2:
				query = query + "nombre";
				break;
			case 3:
				query = query + "eslora";
				break;
			}

			// Primer paso creo un statement
			PreparedStatement pstmt = con.prepareStatement(query);

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

	/**
	 * Funcion que borra de BD el barco con el id
	 * introducido
	 * 
	 * @param idBarco
	 * @return la cantidad de registros borrados, es
	 *         decir 1 si se ha borrado y 0 sino
	 */
	public static int borrar(Connection con, int idBarco) {

		// Query que vamos a ejecutar
		String query = "delete from barcos where idBarcos = ?";

		int numRegAfect = 0;

		try {
			// Con la query generamos la instruccion a
			// ejecutar
			PreparedStatement pstmt = con.prepareStatement(query);

			// Asociamos a la interrogacion el valor
			pstmt.setInt(1, idBarco);

			numRegAfect = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return numRegAfect;
		}

		return numRegAfect;

	}

	public static int insertar(Connection con, BarcoDO barco) {

		// Query que vamos a ejecutar
		String query = "INSERT INTO `onboard`.`barcos` " + "(`idbarcos`, `nombre`, `descripcion`, `categoria`, "
				+ "`eslora`, `competicion`, `peso`, `precio`, `cliente_idcliente`) " + "VALUES (?,?,?,?,?,?,?,?,?)";

		int numRegAfect = 0;

		try {
			// Con la query generamos la instruccion a
			// ejecutar
			PreparedStatement pstmt = con.prepareStatement(query);

			// Asociamos a la interrogacion el valor
			pstmt.setInt(1, barco.getIdBarco());
			pstmt.setString(2, barco.getNombre());
			pstmt.setString(3, barco.getDescripcion());
			pstmt.setInt(4, barco.getCategoria());
			pstmt.setInt(5, barco.getEslora());
			pstmt.setInt(6, barco.isCompeticion() ? 1 : 0);
			pstmt.setInt(7, barco.getPeso());
			pstmt.setInt(8, barco.getPrecio());
			pstmt.setInt(9, barco.getIdCliente());

			numRegAfect = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return numRegAfect;
		}

		return numRegAfect;
	}

}
