package unidad2Condicionales;

import java.util.Scanner;

public class ejemplo7Loteria {

	/**
	 * Realizar un programa que genere aleatoriamente un número de loteria de forma
	 * aleatoria entre 1 y 20 Dos usuarios introduciran sus numeros de loteria por
	 * teclado El programa debera decir a los usuarios si les ha tocado el número de
	 * loteria Tambien dirá que usuario ha estado más cerca de acertar o si estan
	 * igual
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		int numPremiado = 0, numJug1 = 0, numJug2 = 0;
		int disJug1 = 0, disJug2 = 0;
		Scanner teclado = new Scanner(System.in);

		// Generamos el numero aleatorio entre 0 y 20
		numPremiado = (int) (Math.random() * 21);

		// leemos los datos
		System.out.println("Jugador 1 introduce tu boleto (entre 0 y 20)");
		numJug1 = teclado.nextInt();
		System.out.println("Jugador 2 introduce tu boleto (entre 0 y 20)");
		numJug2 = teclado.nextInt();

		// Si les ha tocado el premio les mostramos un mensaje
		if (numJug1 == numPremiado)
			System.out.println("Felicidades Jugador1 tu numero " + numJug1 + " ha sido premiado");
		if (numJug2 == numPremiado)
			System.out.println("Felicidades Jugador2 tu numero " + numJug2 + " ha sido premiado");

		// Comprobamos que a nadie le ha tocado
		if (numPremiado != numJug1 && numPremiado != numJug2) {
			// Calculamos las distancias entre el numero premiado y los jugadores
			disJug1 = numPremiado - numJug1;
			disJug2 = numPremiado - numJug2;

			// Pasamos a positivo los posibles valores negativos
			// utilizando la funcion valor absoluto
			disJug1 = Math.abs(disJug1);

			// Otra forma de pasar a positivo es si es negativo cambiar el signo
			if (disJug2 < 0)
				disJug2 = -disJug2;

			if (disJug1 < disJug2)
				System.out.println("Jugador 1 esta más cerca!!! El numero premiado era " + numPremiado);
			else if (disJug2 < disJug1)
				System.out.println("Jugador 2 esta más cerca !!! El numero premiado era " + numPremiado);
			else
				System.out.println("Empate");
		}

		teclado.close();
	}

}
