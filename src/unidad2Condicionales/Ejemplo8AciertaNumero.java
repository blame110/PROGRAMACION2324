package unidad2Condicionales;

import java.util.Random;

public class Ejemplo8AciertaNumero {

	/**
	 * El pograma genera un número aleatorio entre 1 y
	 * 19 y el usuario lo acertara en 3 intentos o
	 * explotara una bomba enganchada a su cuerpo El
	 * programa diabolico en cada fallo le dira si el
	 * numero a acertar esa mayor o menor y le metera
	 * presion en el primer fallo hay un 30% de
	 * posibilidades de que la maquine le mienta
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Randon mas aleatorio que math.random
		Random rand = new Random();
		System.out.println(rand.nextInt());
		System.out.println(rand.nextDouble());

	}

}
