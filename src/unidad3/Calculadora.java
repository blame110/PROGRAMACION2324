package unidad3;

public class Calculadora {

	// Si el modificador de una variable es public se
	// puede
	// acceder desde cualquier parte
	public final double PI = 3.14159;

	// Si el modificador de acceso es private implica
	// que
	// solo se puede
	// utilizar dentro de la clase
	private final double PLCK = 2323.2323;

	/**
	 * Funcion que recibe dos números y los suma
	 * 
	 * @param x
	 * @param y
	 * 
	 *          Para definir una funcion se sigue la
	 *          siguiente sintaxis: public
	 *          <tipo_devolver>
	 *          nombre_funcion(<param1>,<param2>,...) {
	 *          codigo }
	 * 
	 * 
	 */
	public int suma(int x, int y) {
		// Hago los calculos
		int suma = x + y;

		// Con return devuelvo la suma de los dos
		// numeros
		// que me pasan como parametros
		return suma;
	}

	/**
	 * Funcion factorial que recibe un numero y
	 * devuelve la multiplicacion desde 1 hasta dicho
	 * numero por ejemplo si num es 3 devolvera 1*2*3
	 * es decir 6
	 * 
	 * @param num
	 * @return
	 */
	public static long factorial(int num) {
		long factorial = 1;

		// Vamos multiplicando por i y guardando las
		// multiplicaciones en factorial
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

		// Devolvemos el valor resultante
		return factorial;
	}

	/**
	 * 6!=6*5*4*3*2*1=6*5! 5!=5*4*3*2*1=5*4! 4!=4*3*2*1
	 * 3!=3*2*1 !2=2*1 !1=1
	 * 
	 * 
	 * n!= n*(n-1)!
	 * 
	 * @param num
	 * @return
	 */
	public static long factorialR(int num) {
		long factorial = 1;

		if (num == 1 || num == 0)
			return num;

		return num * factorialR(num - 1);
	}

	/**
	 * Funcion que divide dos numeros
	 * 
	 * @param x dividendo
	 * @param y divisor
	 * @return -1 si el divisor es 0 o el resultado de
	 *         la division
	 */
	public static int dividir(int x, int y) {
		// return (y == 0 ? -1 : x / y);
		// Si el divisor es 0 sale infinito, devolvemos
		// error
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
		// Si el divisor es 0 sale infinito, devolvemos
		// error
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
			// Si un elemento es menor que nuestro
			// minimo
			// es el nuevo minimo
			if (listaNum[i] < min)
				min = listaNum[i];
		}

		return min;

	}

	/**
	 * La funcion busca la posicion de un número dentro
	 * de un array ordenado
	 * 
	 * [1,4,9,13,34,56,122]
	 * 
	 * @param listaNumeros array de numeros ordenado
	 * @param numBus       numero a buscar
	 * @return posicion donde esta el número, -1 si no
	 *         esta
	 */
	public static int buscaNumero(int listaNumeros[], int numBus) {

		// Recorremos todo el array de numeros con i
		for (int i = 0; i < listaNumeros.length; i++) {
			// Si en la posicion i esta la palabra
			// buscada devolvemos el valor
			if (numBus == listaNumeros[i]) {
				return i;
			}
		}
		// Si llega hasta aqui es que se ha recorrido
		// todo el array
		// y no se ha encontrado el número
		return -1;
	}

	/**
	 * La funcion busca la posicion de un número dentro
	 * de un array ordenado
	 * 
	 * [1,4,9,13,34,56,122]
	 * 
	 * 1 , [4,9,13,34,56,122]
	 * 
	 * @param listaNumeros array de numeros ordenado
	 * @param numBus       numero a buscar
	 * @return posicion donde esta el número, -1 si no
	 *         esta
	 */
	public static int buscaNumeroR(int listaNumeros[], int numBus, int posAct) {

		// Si enconbramos el numero buscado en la
		// posicion actual lo devolvemos
		if (listaNumeros[posAct] == numBus)
			return posAct;
		else
		// Si estamos en la ultima posicion y no es el
		// número a buscar
		// El numero no se encuentra
		if (posAct == listaNumeros.length - 1)
			return -1;

		// Llamada recursiva
		return buscaNumeroR(listaNumeros, numBus, posAct + 1);

	}

	// PORHACER
	// Funcion que recibe un array y una posicion de
	// comienzo y una de fin
	// Devuelve un array resultante de copiar el corte
	// del array
	// que recibe por las posiciones que recibe

	/**
	 * Esta funcion recibe un array de enteros y
	 * devuelve el valor minimo [2,3,1,5] 2, [3,1,5]->
	 * 3, [1,5]->1 , 5
	 * 
	 * @param listaNum array de enteros
	 * @return el menor de los numeros
	 */
	public static int minR(int listaNum[]) {

		// Si solo hay un número es el minimo por
		// c@#~@€
		if (listaNum.length == 1)
			return listaNum[0];

		// Separamos el primer número (de la izquierda)
		// si hay mas de uno
		int numIzq = listaNum[0];

		int listaDerecha[] = new int[listaNum.length - 1];

		// Copio todos los datos del array desde la
		// posicion 1 hasta la final
		for (int i = 1; i < listaNum.length; i++) {
			// Vamos copiando los números de un array a
			// otro
			listaDerecha[i - 1] = listaNum[i];
		}

		// Si el número de la izquierda es menor que el
		// menor del resto
		// Devuelvo dicho número, en caso contrario
		// devuelvuelvo el menor del resto
		// Llamamos a la funcion recursivamente para
		// sacar el minimo de la parte derecha
		int minDer = minR(listaDerecha);

		if (numIzq < minDer)
			return numIzq;
		else
			return minDer;

	}

	public double areaCirculo(double radio) {
		// Variable local con el mismo nombre que la
		// global
		// Por defecto utilizaria esta si no usamos
		// this
		double PI = 3.15;
		double area = 0;

		// Utilizando this usamos la constante de la
		// clase, no
		// Nuestra variable local
		area = this.PI * radio * radio;

		// devolvemos la funcion
		return area;

	}

}
