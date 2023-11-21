package unidad2bucles;

public class EjemploArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable simple que almacena un valor
		// del tipo declarado en este caso un entero
		int edad;

		// Array de numeros enteros, es igual solo que son
		// muchos
		// En java hay que definir la cantidad de elementos que
		// pueden guardarse

		int edadesAlumnos[] = new int[20];
		// Podemos a la hora de crear los arrays darles valores
		// iniciales
		String listaNombres[] = { "jose", "juan", "pepe" };

		// Para insertar datos utilizamos el operador [ ]
		// indicando
		// dentro la posicion en la cual vamos a guardar el
		// valor
		// Se empieza por la posicion 0 y se acaba por la n-1
		// siendo n el tamaño del array
		edadesAlumnos[0] = 23;
		listaNombres[2] = "PEdro";

		System.out.println("El segundo nombre es: " + listaNombres[1]);

		System.out.println("el array tiene " + edadesAlumnos.length + " elementos");

		int random = (int) (Math.random() * 90) + 1;

		// Rellenamos el array de numeros aleatorios
		for (int i = 0; i < edadesAlumnos.length; i++) {
			// Insertamos el número aleatorio en la posicion i
			edadesAlumnos[i] = random;
			// Creamos un aleatorio para la siguiente posicion
			random = (int) (Math.random() * 90) + 1;
		}

		// Mostramos el contenido del array

		// El bucle for puede recorrer los elementos de un
		// array con la siguiente estructura
		// Para cada elemento del array realiza una repeticion
		// y guarda en edadActual el valor
		//
		for (int edadActual : edadesAlumnos) {
			System.out.println(edadActual);

		}

	}

}
