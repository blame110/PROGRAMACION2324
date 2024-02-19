package unidad4;

import java.sql.Connection;
import java.sql.SQLException;

import unidad4.model.ClienteDO;
import unidad4.model.ModelCliente;
import unidad4.utils.UtilsBD;

public class EjemploTransaccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = UtilsBD.conectarBD();

		// Cerramos la conexion
		try {

			// Si ponemos autocommit a false
			// Existe la posiblidad de borrar las
			// operaciones de bd
			// Que se hayan realizado
			con.setAutoCommit(false);

			ClienteDO juan = new ClienteDO(-1, "juan", "perez", 23, 'M', "email@email2.com", "passswuord");

			ModelCliente.insertCliente(con, juan);

			// Modificamos los datos de juan
			juan.setIdCliente(102);
			juan.setApellidos("Picapiedra");
			juan.setEdad(45);

			ModelCliente.updateCliente(con, juan);

			ModelCliente.removeCliente(con, 67);

			// En el momento que haga commit se hacen
			// permanentes
			// En bd todas las instrucciones ejecutadas
			con.commit();

			// Cerramos la conexion
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

	}

}
