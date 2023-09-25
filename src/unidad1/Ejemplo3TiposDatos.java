package unidad1;

public class Ejemplo3TiposDatos {

	/**
	 * Vamos a leer por teclado variables de todos los tipos de datos 
	 * primitivos de Java y los mostramos por pantalla
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tipos de datos y sus valores
		byte edadEmpleado =45;
		short edad =23;
		int numAlum = 238;
		float notaMedia = 7.34f;
		double pi = 3.14159231231231;
		boolean esMayorEdad = false; //o true
		char letraPuerta = 'B';
		String telefono = "(0034) - 765243344";
		
		
		//color pelo
		String colorPelo = "Rubio";
		//tipo pelo
		String tipoPedlo = "Largo Lagarto";
		//edad
		short edadP = 20000;
		//puntos vida
		int pVida = 200;
		//peso
		float peso = 85.34f;
		//ataque
		int ataque =23;
		//esNoMuerto
		boolean esNoMuerto = true;
		//puntos magia
		int pMagia = 0;
		//nivel Personaje
		int nivel =1;
		
		
		//Subida de nivel;
		nivel= nivel+1;
		//Igual a la anterior
		System.out.println(nivel++);
		//Si ponemos el operador ++ antes de la variable primero se incrementa
		//el valor y luego ejecuta el resto de operadores/instrucciones
		System.out.println(++nivel);
			
		
		//Incremento de vida por subida de nivel
		pVida = pVida +10;
		//Esta instruccion es igual a la anterior
		pVida += 10;
		
		
		
		
		
		
	
		
		
		
	}

}
