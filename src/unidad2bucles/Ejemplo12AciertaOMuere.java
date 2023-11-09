package unidad2bucles;

import java.util.Scanner;

public class Ejemplo12AciertaOMuere {

	/**
	 * Generar un número aleatorio entre 1 y 10 El usuario
	 * tiene 3 intentos para acertarlo La maquina le da
	 * pistas sobre si es menor o mayor en cada fallo pero
	 * tiene un 25% de posibilidades de mentir
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int listaNumeros[] = new int[20];

		int numBuscar = (int) (Math.random() * 10) + 1;
		int numIntentos = 3;
		int num = -1;
		Scanner teclado = new Scanner(System.in);

		while (numIntentos > 0 && num != numBuscar) {
			// Le pedimos al usuario un numero
			System.out.println("introduce un numero (no te pongas nervioso, pero tu vida depende de esto): ");
			num = teclado.nextInt();

			// Decrementamos los intentos
			numIntentos--;

			// Si falla le damos una pista
			if (num != numBuscar && numIntentos > 0) {

				// Tengo un 25% de posiblidades de mentir
				boolean miento = (Math.random() < 0.25);

				/*
				 * Tabla de verdad de la condicion conjunta erronea
				 * num<numBuscar !nomiento resultado && true true true
				 * true false false false true false false false false
				 */
				if (num < numBuscar)
					System.out.println("El numero buscado es " + (miento ? "menor" : "mayor") + "  que el introducido ("
							+ miento + ")");
				else
					System.out.println("El numero buscado es " + (miento ? "mayor" : "menor") + " que el introducido ("
							+ miento + ")");

			}

		}

		if (num == numBuscar)
			System.out.println("Te has librado esta vez, pero tu fin es inevitable Muajajajaja");
		else
			System.out.println("El número era " + numBuscar + " Muajajajaja");

		teclado.close();

	}

}
