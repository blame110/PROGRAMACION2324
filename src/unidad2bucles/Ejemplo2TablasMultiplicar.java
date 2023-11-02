package unidad2bucles;

import java.util.Scanner;

public class Ejemplo2TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		int numTabla = 0, limMult = 0, i = 1;
		Scanner teclado = new Scanner(System.in);

		// Tabla de multiplicar del 5
		while (i <= 10) {
			// Mostramos la multiplicacion del número actual
			System.out.println("5 x " + i + " = " + (5 * i));
			// Incrementamos el contador
			// Para pasar al siguiente numero
			i++;
		}

		// Mostramos la tabla de multiplicar de un numero que nos introducen por
		// pantalla
		System.out.println("Tabla de multiplicar del: ");
		numTabla = teclado.nextInt();

		System.out.println("Hasta qué número quieres multiplicar: ");
		limMult = teclado.nextInt();

		// Reseteamos la i del bucle anterior y la ponemos a 0
		i = 1;
		// Tabla de multiplicar del numero elegido
		while (i <= limMult) {
			// Mostramos la multiplicacion del número actual
			System.out.println(numTabla + " x " + i + " = " + (numTabla * i));
			// Incrementamos el contador
			// Para pasar al siguiente numero
			i++;
		}

		/*
		 * Ejemplo de bucle for equivalente al primer while tiene tres partes, primero
		 * declaracion de indices y variables segunda parte condicion, es igual que en
		 * el while, mientras sea cierta se repite tercera parte incremento del indice o
		 * instrucciones para pasar siguiente elemento
		 */
		for (int j = 1; j <= 10; j++)
			System.out.println(j);

		teclado.close();
	}

}
