package unidad2bucles;

import java.util.Scanner;

public class SolucionExamenAnt {

	/**
	 * Realizar un programa en java que haga los siguientes
	 * cálculos.
	 * 
	 * Escribir un programa en java que lea x empleados (
	 * se pide por teclado la cantidad), de cada empleado
	 * tenemos la siguiente información:
	 * 
	 * -nombre -edad -sueldo -estado civil (S- Soltero,
	 * C-Casado, D-Divorciado) -diasBaja
	 * 
	 * Calcular los siguiente:
	 * 
	 * La suma de los días de bajas de los empleados
	 * divorciados
	 * 
	 * El nombre del empleado de mayor sueldo que esté
	 * casado
	 * 
	 * Queremos sacar una lista de nombres con los
	 * empleados que tienen derecho a extra de navidad (se
	 * valorará si se almacenan en un array, aunque no es
	 * obligatorio), tienen que cumplir tener menos de 30
	 * días de baja y más de 40 años o con que estén
	 * divorciados también la cobran.
	 * 
	 * Luego también se desea una saber el porcentaje de
	 * solteros, casados y divorciados
	 * 
	 * La correcta lectura y cada uno de los apartados
	 * tienen valores iguales, se utilizará la rúbrica de
	 * classroom para valorar el exámen. Un único bucle es
	 * necesario para tratar los datos.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		Scanner teclado = new Scanner(System.in);
		int numEmp = 0;
		// -nombre -edad -sueldo -estado civil (S- Soltero,
		// * C-Casado, D-Divorciado) -diasBaja
		String nombre = "";
		int edad = 0;
		float sueldo = 0;
		char estCiv = ' ';
		int diasBaja = 0;
		long sumaDBaja = 0;
		int numCasados = 0;
		int numSolteros = 0;
		int numDivorciados = 0;

		float maxSueldo = Float.MIN_VALUE;
		String nombreMasForrao = "";

		String listaNombres[];

		// Leemos la cantidad de empleados
		System.out.println("Cuantos Empleados vamos a leer?:");
		numEmp = teclado.nextInt();

		// Creamos el espacio para guardar los nombres en el
		// array
		listaNombres = new String[numEmp];

		// Posicione en la cual vamos a ir guardando los
		// nombres de los empleados
		// Que cobran la paga extra
		int posNombre = 0;
		// PAra cada empleado tratamos los datos
		for (int i = 0; i < numEmp; i++) {

			// Leemos los datos del empleado

			System.out.print("Edad del empleado " + (i + 1) + ":");
			edad = teclado.nextInt();

			System.out.print("Sueldo del empleado " + (i + 1) + ":");
			sueldo = teclado.nextFloat();

			System.out.print("Cuandos días de baja ha estado el empleado" + (i + 1) + ":");
			diasBaja = teclado.nextInt();

			System.out.print("Cual es el estado civil del empleado (S- Soltero,C-Casado, D-Divorciado)");
			estCiv = teclado.next().toUpperCase().charAt(0);

			teclado.nextLine();

			System.out.print("Nombre del empleado " + (i + 1) + ":");
			nombre = teclado.nextLine();

			// Vamos sumando en sumaDBaja todos los días de baja de
			// los empleados
			sumaDBaja = sumaDBaja + diasBaja;

			// Vamos guardando el nombre del sueldo máximo
			if (sueldo > maxSueldo) {
				maxSueldo = sueldo;
				nombreMasForrao = nombre;
			}

			/*
			 * Queremos sacar una lista de nombres con los
			 * empleados que tienen derecho a extra de navidad (se
			 * valorará si se almacenan en un array, aunque no es
			 * obligatorio), tienen que cumplir tener menos de 30
			 * días de baja y más de 40 años o con que estén
			 * divorciados también la cobran.
			 * 
			 */

			if ((diasBaja < 30 && edad > 40) || estCiv == 'D') {
				System.out.println(nombre);

				// Metemos los nombres de los empleados en el array
				listaNombres[posNombre] = nombre;
				posNombre++;

			}

			// Vamos contando los dicrociados, solteros y casados
			switch (estCiv) {
			case 'S':
				numSolteros++;
				break;
			case 'D':
				numDivorciados++;
				break;
			case 'C':
				numCasados++;
				break;

			}

		} // fin de bucle principal

		// Mostramos los resultados por pantalla

		System.out.println("Los días totales de baja son " + sumaDBaja);

		System.out.println("El más forrao de la empresa es " + nombreMasForrao + " cobra " + maxSueldo);

		// Para calcular los porcentajes dividimos el numero
		// parcial entre el total y x100
		System.out.println("El porcentaje de empleados casados es " + (numCasados * 100 / numEmp));

		System.out.println("El porcentaje de empleados solteros es " + (numSolteros * 100 / numEmp));

		System.out.println("El porcentaje de empleados divorciados es " + (numDivorciados * 100 / numEmp));

		// Mostramos por pantalla los nombres de los empleados
		// con derecho a extra de navidad

		for (String nombreAc : listaNombres) {

			if (nombreAc != null)
				System.out.println(nombreAc);
		}
		// Bucle equivalente al anterior con el for noeach
		for (int i = 0; i < listaNombres.length; i++) {

			if (listaNombres[i] != null)
				System.out.println(listaNombres[i]);
		}

		teclado.close();

	}

}
