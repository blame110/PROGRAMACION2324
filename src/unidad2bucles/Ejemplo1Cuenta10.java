package unidad2bucles;

import java.util.Scanner;

public class Ejemplo1Cuenta10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		int i = 1;
		int numCuenta = 0;
		Scanner teclado = new Scanner(System.in);

		/*
		 * Muestro los numeros de 1 a 10 El bucle repite las instrucciones de su bloque
		 * de código muchas veces Mientras la condicion sea cierta El bucle va
		 * incrementando el valor de i y mostrandolo Parara cuando el valor de i sea 11
		 * Entra en el bucle mientras la condicion sea cierta por lo cual la condicion
		 * es mientras la i sea menor de 11 o menor igual a 10
		 */
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// Realizar un bucle que me muestre una cuenta atras de la cantidad de numeros
		// que
		// me pongan por teclado
		System.out.println("Cantidad de numeros de la cuenta atras:");
		numCuenta = teclado.nextInt();
		// Mientras sea mayor o igual a cero vamos contando
		while (numCuenta >= 0) {

			// PORHACER PONGA NUMCUENTA "." DELANTE DEL NUMERO
			if (numCuenta == 0)
				System.out.println("Pumbaaa!! Sanseacabo!!");
			else
				System.out.println("..." + numCuenta);

			numCuenta--;

		}

		teclado.close();

	}

}
