package unidad2;

import java.util.Scanner;

public class Ejemplo2Condicionalif {

	/**
	 * El programa lee de teclado una nota y nos dice si es insuficiente,suficiente,
	 * bien, notable, sobresaliente
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double nota = 0.0;

		// Mostramos un mensaje para que se introduzca la nota
		System.out.print("Introduce la nota: ");
		nota = teclado.nextDouble();

		// Comprobamos si el valor esta dentro del rango
		if (nota >= 0 && nota <= 10) {

			System.out.println("El valor esta entre 0 y 10");

			if (nota < 5)
				System.out.println("Insuficiente");
			else {
				// Entramos en el else cuando la condicion del if asociado es falsa
				// En este caso implicaria que la nota es >=5
				if (nota < 6)
					System.out.println("Suficiente");
				else
				// Entra si es mayor o igual a 6
				if (nota < 7)
					System.out.println("Bien");
				else
				// Entra si es mayor o igual a 7
				if (nota < 9)
					System.out.println("Notable");
				else
					System.out.println("Sobresaliente");

			}

		}

		// Cerramos el objeto teclado una vez no lo necesitamos
		teclado.close();

	}

}
