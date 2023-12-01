package unidad3;

public class Calculadora {

	public final double PI = 3.14159;

	/**
	 * Funcion que recibe dos números y los suma
	 * 
	 * @param x
	 * @param y
	 * 
	 *          Para definir una funcion se sigue la
	 *          siguiente sintaxis: public <tipo_devolver>
	 *          nombre_funcion(<param1>,<param2>,...) {
	 *          codigo }
	 * 
	 * 
	 */
	public int suma(int x, int y) {
		// Hago los calculos
		int suma = x + y;
		// Con return devuelvo la suma de los dos numeros
		// que me pasan como parametros
		return suma;
	}

	/**
	 * Funcion que divide dos numeros
	 * 
	 * @param x dividendo
	 * @param y divisor
	 * @return -1 si el divisor es 0 o el resultado de la
	 *         division
	 */
	public static int dividir(int x, int y) {
		// return (y == 0 ? -1 : x / y);
		// Si el divisor es 0 sale infinito, devolvemos error
		System.out.println("Trabajo con enteros");
		if (y == 0)
			return -1;

		return x / y;
	}

	/**
	 * Funcion dividir sobrecargada que recibe float
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static float dividir(float x, float y) {
		// return (y == 0 ? -1 : x / y);
		// Si el divisor es 0 sale infinito, devolvemos error
		System.out.println("Trabajo con Float");

		if (y == 0)
			return -3;

		return x / y;
	}

	/**
	 * Recibe un array de enteros y devuelve el valor
	 * minimo
	 * 
	 * @param listaNum array de enteros
	 * @return valor minimo
	 */
	public static int min(int listaNum[]) {
		int min = Integer.MAX_VALUE;
		// Recorremos todos los elementos del array
		for (int i = 0; i < listaNum.length; i++) {
			// Si un elemento es menor que nuestro minimo
			// es el nuevo minimo
			if (listaNum[i] < min)
				min = listaNum[i];
		}

		return min;

	}

	public double areaCirculo(double radio) {
		// Variable local con el mismo nombre que la global
		// Por defecto utilizaria esta si no usamos this
		double PI = 3.15;
		double area = 0;

		// Utilizando this usamos la constante de la clase, no
		// Nuestra variable local
		area = this.PI * radio * radio;

		// devolvemos la funcion
		return area;

	}

}
