package unidad2Condicionales;

public class Ejemplo9ReturnSentence {

	/**
	 * La funcion recibe un numero y devuelve 0 si es impar y 1 si es par
	 * 
	 * @param num numero que recibe
	 * @return 0 si es par y 1 si es impar
	 */
	public static int esPar(int num) {
		if (num % 2 == 0)
			return 0;
		else
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(esPar(3));

	}

}
