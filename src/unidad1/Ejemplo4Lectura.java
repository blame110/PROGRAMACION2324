package unidad1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejemplo4Lectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="";
		int edad =0;
		String clase="";
		
		//leemos con una ventana modal la clase utilizando la funcion showinputDialog de optionpane
		clase = JOptionPane.showInputDialog(null,"Clase: ","Introduce Datos",JOptionPane.QUESTION_MESSAGE);
		
		//Creamos un objeto Scanner para leer de teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		
		//leemos por teclado un string con nextLine de Scanner
		nombre=teclado.nextLine();
		
		System.out.print("Introduce tu edad: ");
		//Leemos por teclado con nexInt un número
		edad= teclado.nextInt();
		
			
		System.out.println("Hola " + nombre + " eres de clase " + clase+ " tienes " + edad + " años, bienvenido a Java");
		
		
		//Cerramos el teclado para que no ocupe memoria
		teclado.close();
		
	}

}
