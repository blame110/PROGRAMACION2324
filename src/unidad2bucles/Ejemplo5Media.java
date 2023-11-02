package unidad2bucles;

public class Ejemplo5Media {

	/**
	 * El programa recibe un string con las notas cada caracter es un numero de 1 a
	 * 9 El programa devuelve la media
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		String sNotas = "3832453456759475623874328394752";
		float media = 0.0f;
		float suma = 0.0f;

		// System.out.println("Caracter en posicion 30: " + sNotas.charAt(30));
		// System.out.println("Longitud: " + sNotas.length());

		// Recorremos el string caracter a caracter
		for (int i = 0; i < sNotas.length(); i++) {

			// System.out.println("letra: " + sNotas.charAt(i));
			// Vamos sumando en suma todos los numeros
			suma = suma + Character.getNumericValue(sNotas.charAt(i));
		}

		// Calculamos la media
		media = suma / sNotas.length();

		System.out.println("La media es: " + media);

	}

}
