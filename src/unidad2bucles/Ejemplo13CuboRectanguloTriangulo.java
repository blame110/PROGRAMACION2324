package unidad2bucles;

import java.util.Scanner;

public class Ejemplo13CuboRectanguloTriangulo {

	public final static int CUADRADO = 1;
	public final static int RECTANGULO = 2;
	public final static int TRIANGULO = 3;

	/**
	 * El programa preguntara que figura quiere que se
	 * dibuje por pantalla si un cuadrado, un rectangulo o
	 * un triangulo y para cada caso pedirá los datos
	 * necesarios y dibujara por pantalla la figura
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numFig = -1;
		int lado = 0;
		int altura = 0;
		Scanner teclado = new Scanner(System.in);
		// Posible condicion seria !(numFig==1 ||numFig==2 ||
		// numFig==3)
		// Mientras el usuario no introduzca un número entre 1
		// y tres
		// Le seguimos dando la brasa pidiendo números de
		// figuras
		while (numFig != 1 && numFig != 2 && numFig != 3) {
			// Leemos la figura a dibujar
			System.out.println("Qué figura quieres que te dibuje? (1-Cuadrado,2-Rectangulo,3-Triangulo): ");
			numFig = teclado.nextInt();
		}

		switch (numFig) {

		case CUADRADO:
			// Dibujamos un cuadrado
			System.out.println("Introduce el lado del cuadrado:");
			lado = teclado.nextInt();

			// Dibujamos lado lineas una debajo de otra
			for (int j = 0; j < lado; j++) {

				// Dibujamos una linea de ancho lado
				for (int i = 0; i < lado; i++)
					System.out.print("#");

				// Bajamos a la siguiente lineaf
				System.out.println();

			}
			break;
		case RECTANGULO:
			// Dibujamos un rectangulo
			// PORHACER EN ESTAS PRACTICAS
			System.out.println("Introduce el ancho del rectangulo:");
			lado = teclado.nextInt();

			break;

		case TRIANGULO:

			/*
			 * # ### ##### ####### ######### ###########
			 * #############
			 * 
			 * El ancho de la ultima linea sera la altura*2-1
			 * 
			 */

			System.out.println("Introduce la altura:");
			altura = teclado.nextInt();

			for (int i = 1; i <= altura; i++) {

				// Dibujamos los espacios de la linea
				for (int z = 1; z <= (altura - i); z++)
					System.out.print(" ");

				// Dibujamos el triangulo
				for (int j = 1; j <= (2 * i) - 1; j++)
					System.out.print("#");

				// Pasamos a la siguiente linea
				System.out.println();

			}

			break;

		}

	}

}
