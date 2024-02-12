package unidad4.utils;

//Con un import podemos utilizar todas las clases
//Del paquete indicado
//El * implica todas las clases dentro de java.sql
import java.sql.Connection;
import java.sql.DriverManager;

public class UtilsBD {

	public static Connection conectarBD() {
		try {

			// Definimos el driver de la BD a al que
			// nos conectamos
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creamos una conexion activa con BD
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "toor");

			// Si no ha saltado la excepcion devolvemos
			// la conexion
			return con;

			// Capturamos
		} catch (Exception excepcion) {
			// Cuando salta el fallo mostramos un
			System.out.println("Error al concectarse");
			excepcion.printStackTrace();
			return null;
			// System.out.println("Espere unos
			// instantes e intentelo again");
		}

	}

}
