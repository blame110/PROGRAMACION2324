package unidad2bucles;

import java.util.Scanner;

public class Ejemplo10Monstruo {

	public static final int TAM_MAPA = 10;
	public static final char MONSTRUO = 'M';
	public static final char TIERRA = 'T';
	public static final char BOSQUE = 'B';
	public static final char JUGADOR = 'J';
	public static final char NORTE = 'N';
	public static final char SUR = 'S';
	public static final char ESTE = 'E';
	public static final char OESTE = 'O';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejemplo de definir el tamaño
		// char mapa[][] = new char[TAM_MAPA][TAM_MAPA];

		// TierraBorrada guardaran las posiciones sobreescritas
		// cuando se muevan
		// el jugador y el monstruo
		char tierraBorradaJ = ' ';
		char tierraBorradaM = ' ';
		char movJug = ' ';
		boolean jugVivo = true;
		Scanner teclado = new Scanner(System.in);
		// Mapa inicial
		char mapa[][] = { { BOSQUE, BOSQUE, BOSQUE, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE },
				{ BOSQUE, BOSQUE, BOSQUE, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE },
				{ BOSQUE, BOSQUE, BOSQUE, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE },
				{ BOSQUE, TIERRA, TIERRA, TIERRA, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE },
				{ TIERRA, TIERRA, TIERRA, TIERRA, TIERRA, TIERRA, TIERRA, TIERRA, TIERRA, TIERRA },
				{ BOSQUE, TIERRA, TIERRA, TIERRA, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE },
				{ BOSQUE, BOSQUE, BOSQUE, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE },
				{ BOSQUE, BOSQUE, BOSQUE, TIERRA, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE },
				{ BOSQUE, BOSQUE, BOSQUE, BOSQUE, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE },
				{ BOSQUE, BOSQUE, BOSQUE, BOSQUE, TIERRA, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE } };

		// Posicionamos al jugador y al monstruo aleatoriamente
		// dentro del mapa
		int posJugX = (int) (Math.random() * 10);
		int posJugY = (int) (Math.random() * 10);

		int posMonX = (int) (Math.random() * 10);
		int posMonY = (int) (Math.random() * 10);

		// Guardo la posicion del mapa donde va a aparecer el
		// jugador
		tierraBorradaJ = mapa[posJugY][posJugX];
		// Ponemos el jugador por primera vez
		mapa[posJugY][posJugX] = JUGADOR;
		tierraBorradaM = mapa[posMonY][posMonX];
		mapa[posMonY][posMonX] = MONSTRUO;

		// Mostramos el mapa
		for (int i = 0; i < TAM_MAPA; i++) {
			// Para cada linea con la j vamos mostrando las
			// posiciones del mapa
			for (int j = 0; j < TAM_MAPA; j++) {
				System.out.print(mapa[i][j]);
			}
			// Una vez acabamos de dibujar una linea del mapa
			// Pasamos a la siguiente linea
			System.out.println();
		}

		// Empieza el juego

		while (jugVivo) {

			// Le preguntamos al jugador a donde quiere moverse
			System.out.print("En que dirección quieres moverte (N,S,E,O)?");
			movJug = teclado.next().charAt(0);

			// Volvemos a poner la tierra borrada en su sitio
			mapa[posJugY][posJugX] = tierraBorradaJ;

			// Calculamos la posicion nueva del jugador
			switch (movJug) {
			case NORTE:
				// Si no estamos arriba del todo movemos al jugador
				// hacia arriba
				if (posJugY != 0)
					posJugY--;
				break;
			case SUR:
				// Si no estamos arriba del todo movemos al jugador
				// hacia arriba
				if (posJugY != TAM_MAPA - 1)
					posJugY++;
				break;
			case ESTE:
				// Si no estamos arriba del todo movemos al jugador
				// hacia arriba
				if (posJugX != TAM_MAPA - 1)
					posJugX++;
				break;
			case OESTE:
				// Si no estamos arriba del todo movemos al jugador
				// hacia arriba
				if (posJugX != 0)
					posJugX--;
				break;

			}

			// Movemos el jugador a la nueva posicion
			// jugador
			tierraBorradaJ = mapa[posJugY][posJugX];
			// Ponemos el jugador por primera vez
			mapa[posJugY][posJugX] = JUGADOR;

			// Calculamos las nuevas posiciones del monstruo
			// Utilizamos el absoluto para que se tenga en cuenta
			// la distancia, tanto si es negativa como si es
			// positiva

			int distX = posMonX - posJugX;
			int distY = posMonY - posJugY;
			// Volvemos a poner la tierra borrada en su sitio
			mapa[posMonY][posMonX] = tierraBorradaM;

			// Calculamos las nuevas posiciones del monstruo
			if (Math.abs(distX) > Math.abs(distY)) {
				// Si la diferencia en X es negativa esta a mi derecha
				if (distX < 0)
					posMonX++;
				else
					posMonX--;
			} else {
				// si la diferencia en Y es negativa esta mas abajo
				if (distY < 0)
					posMonY++;
				else
					posMonY--;
			}

			// Movemos el monstruo a la nueva posicion
			// jugador
			tierraBorradaM = mapa[posMonY][posMonX];
			// Ponemos el jugador por primera vez
			mapa[posMonY][posMonX] = MONSTRUO;

			// Mostramos el mapa
			for (int i = 0; i < TAM_MAPA; i++) {
				// Para cada linea con la j vamos mostrando las
				// posiciones del mapa
				for (int j = 0; j < TAM_MAPA; j++) {
					System.out.print(mapa[i][j]);
				}
				// Una vez acabamos de dibujar una linea del mapa
				// Pasamos a la siguiente linea
				System.out.println();
			}

			// Si el monstruo encuentra al jugador se acabo
			if (posJugX == posMonX && posJugY == posMonY) {
				System.out.println("El monstruo te pillo, a lavarte los dientes!!");
				jugVivo = false;
			}

		}

	}

}
