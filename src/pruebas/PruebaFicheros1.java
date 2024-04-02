package pruebas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PruebaFicheros1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ruta del archivo
		String rutaArchivo = "C:\\Users\\pmpin\\Downloads\\muajaja.txt";

		// Contenido a escribir en el archivo
		String[] lineas = { "Primera línea", "Segunda línea", "Tercera línea" };

		// Intentar escribir en el archivo línea por
		// línea
		try {
			// Abrir el archivo para escritura
			FileWriter fw = new FileWriter(rutaArchivo);
			BufferedWriter bw = new BufferedWriter(fw);

			// Escribir cada línea en el archivo
			for (String linea : lineas) {
				bw.write(linea);
				bw.newLine(); // Añadir un salto de
								// línea después de
								// cada línea
			}

			// Cerrar el BufferedWriter y el FileWriter
			bw.close();
			fw.close();

			System.out.println("Se ha escrito en el archivo correctamente.");
		} catch (IOException e) {
			// Manejar cualquier excepción de E/S
			e.printStackTrace();
		}

	}

}
