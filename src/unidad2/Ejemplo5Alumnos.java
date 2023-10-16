package unidad2;

import java.util.Scanner;

public class Ejemplo5Alumnos {

	/*
	 * Declaramos constantes para los años de la eso se hace poniendo final, esto
	 * hace que el valor No se pueda modificar, es siempre el que se le asigna en la
	 * declaracion
	 */
	public final static int EDAD1_ESO = 2011;
	public final static int EDAD2_ESO = 2010;
	public final static int EDAD3_ESO = 2009;
	public final static int EDAD4_ESO = 2008;
	public final static int EDAD1_BACH = 2007;
	public final static int EDAD2_BACH = 2006;

	/**
	 * El programa lee el año de nacimiento de un alumno del instituto y le dice el
	 * curso que le corresponde
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		int anioNacimiento = 0;
		Scanner teclado = new Scanner(System.in);

		// Leemos el año de teclado
		System.out.print("Escribe tu año de nacimiento:");
		anioNacimiento = teclado.nextInt();

		// El switch compara el valor entre parentesis con los distintos
		// casos y cuando coincida con uno realiza las instrucciones
		// pertinente
		switch (anioNacimiento) {
		case EDAD1_ESO:
			System.out.println("Eres de 1ºESO");
			break;
		case EDAD2_ESO:
			System.out.println("Eres de 2ºESO");
			break;
		case EDAD3_ESO:
			System.out.println("Eres de 3ºESO");
			break;
		case EDAD4_ESO:
			System.out.println("Eres de 4ºESO");
			break;
		case EDAD1_BACH:
			System.out.println("Eres de 1ºBACHILLERATO");
			break;
		case EDAD2_BACH:
			System.out.println("Eres de 2ºBACHILLERATO");
			break;
		default:
			System.out.println("No eres del instituto");

		}

		teclado.close();

	}

}
