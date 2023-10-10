package unidad2;

import java.util.Scanner;

public class Ejemplo3Calculadora {

	/**
	 * El programa lee dos numeros y una operación y nos saca el resultado
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaracion de variables
		int num1 = 0, num2 = 0;
		float resultado = 0;
		String operacion = "";
		Scanner teclado = new Scanner(System.in);

		// Leemos los datos
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Introduce la operación (SUMA, RESTA, MULTIPLICACION, DIVISION: ");
		operacion = teclado.next();
		// Pasamos a mayusculas el texto con la funcion toUpperCase
		operacion = operacion.toUpperCase();

		// Si la operacion no es ninguna de las mostradas mostramos mensaje de error
		// Para comparar String utilizamos la funcion equals no se puede con == o !=
		if (!operacion.equals("SUMA") && !operacion.equals("RESTA") && !operacion.equals("MULTIPLICACION")
				&& !operacion.equals("DIVISION")) {
			System.out.println("La operacion que has introducido no es valida");
		} else {
			// Si la operacion que han introducido es correcta hacemos las operaciones

			// Si es una suma sumamos los numeros
			if (operacion.equals("SUMA")) {

				resultado = num1 + num2;

			}

			// Si es una resta restamos los numeros
			if (operacion.equals("RESTA")) {

				resultado = num1 - num2;

			}

			// Si es una multiplicacion multiplica los numeros
			if (operacion.equals("MULTIPLICACION")) {

				resultado = num1 * num2;

			}

			// Si es una division dividimos los numeros
			if (operacion.equals("DIVISION")) {

				// Si el divisor (num2) es 0, es infinito, no hacemos la operacion
				if (num2 == 0) {
					// Si ademas el num1 es 0 el resultado es indeterminado
					if (num1 == 0)
						System.out.println("El resultado es indeterminado, mete algo que no sean ceros");
					else
						System.out.println("El resultado es infinito");
				} else {
					// Si el numero que divide no es 0 hacemos la division normalmente
					resultado = num1 / num2;

				}
				// Mostramos el resultado por pantalla
				System.out.println("El resultado es : " + resultado);

			} else
				// Mostramos el resultado por pantalla
				System.out.println("El resultado es : " + resultado);
		}

		// Cerramos el teclado
		teclado.close();

	}

}
