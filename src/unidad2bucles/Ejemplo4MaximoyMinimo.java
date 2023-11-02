package unidad2bucles;

import java.util.Scanner;

public class Ejemplo4MaximoyMinimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		int num = 0, cantidad = 0;
		// Inicializamos el máximo al menor valor posible MINVALUE
		int max = Integer.MIN_VALUE, secMax = 0;

		Scanner teclado = new Scanner(System.in);
		// Programa que busca el mayor de un conjunto de números y el segundo mayor

		// Mostramos un mensaje para pedir la cantidad de numeros
		System.out.println("Cuantos números hay en total? ");
		cantidad = teclado.nextInt();
		// TODO hacer el minimo
		// Hacemos un bucle for para leer los numeros
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce el numero " + (i + 1) + ":");
			num = teclado.nextInt();

			// Si el numero leido por teclado es mayor que nuestro
			// máximo actual, implica que es el nuevo máximo
			if (num > max) {
				// Antes de actualizar el máximo
				// Guardo el máximo cómo el segundo mayor
				secMax = max;
				max = num;

			} else {
				if (num > secMax)
					// Guardo el máximo cómo el segundo mayor
					secMax = num;
			}

		}

		// Una vez acabado el bucle
		System.out.println("El máximo es: " + max);
		System.out.println("El segundo máximo es: " + secMax);
		teclado.close();
	}

}
