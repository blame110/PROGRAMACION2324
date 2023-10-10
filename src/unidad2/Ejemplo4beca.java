package unidad2;

import java.util.Scanner;

public class Ejemplo4beca {

	/**
	 * El programa calcula la cuantia de la beca para un alumno Seran 6000 euros si
	 * el alumno es menor de edad y la renta familiar menos de 20mil euros Sera un
	 * 25% de los 6000 euros si la renta es menor de 30mil euros o es refugiado
	 * Leemos dos datos edadAlumno, rentaFamiliar esRefugiado
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variables
		int edadAlumno = 0;
		double rentaFamiliar = 0;
		int importeBeca = 0;
		char esRefugiadoc = 'N';
		boolean esRefugiado = false;
		Scanner teclado = new Scanner(System.in);

		// Leemos los datos de teclado
		System.out.println("Introduce la edad");
		edadAlumno = teclado.nextInt();
		System.out.println("Introduce la renta familiar");
		rentaFamiliar = teclado.nextDouble();
		// Leemos esRefugiado como char, con charAt cogemos el primer caracter
		// Del String que se lee con teclado.next
		System.out.println("Eres Refugiado Politico? (S/N)");
		esRefugiadoc = teclado.next().toUpperCase().charAt(0);

		// Utilizamos el operador ternario para asignar true o falso a esRefugiado
		// Si la condicion que preguntamos es cierta asigna el valor a continuacion
		// Si es falsa asigna el valor que hay despues de los ":"
		esRefugiado = (esRefugiadoc == 'S' ? true : false);
		/*
		 * La anterior sentencia es equivalente a este if
		 * 
		 * if (esRefugiadoc=='S') esRefugiado=true; else esRefugiado=false;
		 */

		// Si es menor de edad y la renta es menos de 20mil
		if (edadAlumno < 18 && rentaFamiliar < 20000) {
			importeBeca = 6000;
		} else {
			if (rentaFamiliar < 30000 || esRefugiado) {

				importeBeca = (int) (6000 * 0.25);
			}
		}

		teclado.close();
	}

}
