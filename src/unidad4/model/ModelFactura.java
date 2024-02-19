package unidad4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelFactura {

	/**
	 * La funcion recibe una conexion y devuelve los
	 * datos de todas las facturas
	 * 
	 * @param con
	 * @return un resulset con los datos de los
	 *         facturas o nulo si hay problemas
	 */
	public static ResultSet getFacturas(Connection con) {

		try {

			// Primer paso creo un statement
			Statement stmt = con.createStatement();

			// Ejecutamos la query y los resultados
			// quedan en el resulset
			ResultSet rs = stmt.executeQuery("SELECT * FROM FACTURA");

			// devolvemos el resulset
			return rs;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;

		}

	}

	public static ResultSet getFacturaCliente(Connection con, int idCliente) {

		try {

			// Ejemplo inyeccion sql idCliente="23;drop
			// squema tienda;"

			// Para meter parametros en una query
			// Es obligatorio hacerlo con
			// prepareStatement
			// Que evita la inyeccion sql
			// Primero creamos el preparestatement con
			// la query
			// Y en la query ponemos ? en los datos a
			// introducir
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM FACTURA WHERE idCliente=?");

			// Para asignar los valores a las ? hay que
			// poner la posicion de la interrogacion
			// El tipo de datos y el valor o variable
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

}
