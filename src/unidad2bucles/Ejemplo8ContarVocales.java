package unidad2bucles;

public class Ejemplo8ContarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables
		String texto = " ñalskedjfñ iasdñUIOflkjañsdfklj oañsdj fñajds f";
		int numVocales = 0;

		// Para recorrer todos los caracteres del texto
		// utilizamos el indice i que va desde 0 hasta la posicion
		// del ultimo caracter, que es length() -1
		for (int i = 0; i < texto.length(); i++) {
			// Convertimos de mayusculas a minusculas el caracter actual
			char letra = Character.toLowerCase(texto.charAt(i));

			// Si cumple esta condicion implica que es una vocal
			// Por lo cual incrementamos el número de vocales
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
				numVocales++;
		}

		System.out.println("El texto tiene " + numVocales + " vocales.");

	}

}
