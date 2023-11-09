package unidad2bucles;

public class Ejemplo11TablasMultiplicar {

	/**
	 * El programa muestra por pantalla todas las tablas de
	 * multiplicar del 1 al 10
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int agraciado = (int) (Math.random() * 30);
		// System.out.println("Agraciado el alumno en el pc " +
		// agraciado);

		// Bucle que se repite una vez por cada tabla
		for (int i = 1; i <= 10; i++) {

			System.out.println("\n******************************");
			System.out.println("*        TABLA DEL " + i + "        **");
			System.out.println("******************************\n");

			// Bucle que muestra la tabla de multiplicar de i
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));

			}

		}

		System.out.println("**FORMA 2 **");

		// Otra opcion con while
		int numTabla = 1;
		int i = 1;
		System.out.println("\n******************************");
		System.out.println("*        TABLA DEL " + numTabla + "        **");
		System.out.println("******************************");
		while (numTabla <= 10) {
			System.out.println(numTabla + " X " + i + "=" + (numTabla * i));
			i++;

			// Si acabamos la tabla actual porque i llega a 10
			// Pasamos a la siguiente tabla
			if (i == 11) {
				System.out.println("\n******************************");
				System.out.println("*        TABLA DEL " + (numTabla + 1) + "        **");
				System.out.println("******************************");

				numTabla++;
				i = 1;
			}

		}

	}

}
