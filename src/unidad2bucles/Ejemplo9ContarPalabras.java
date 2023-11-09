package unidad2bucles;

public class Ejemplo9ContarPalabras {

	/**
	 * El programa contara las veces que la palabra esta en un texto
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "En la casa de pepito la comida esta ricala";
		String palabra = "la";
		int numPalabras = 0;
		// La variable posBusc guarda la posicion a partir de cual buscamos
		int posBusc = 0;

		// Mientras indexof no nos diga que no hay mas palabras, sigo buscando
		while (posBusc != -1) {
			posBusc = texto.indexOf(palabra, posBusc);
			// Si indexof me devuelve algo distinto a -1 implica que ha encontrado la
			// palabra
			if (posBusc != -1) {
				numPalabras++;
				posBusc++;
			}
		}

		System.out.println("La palabra '" + palabra + "' esta " + numPalabras + " veces en el texto");

	}

}
