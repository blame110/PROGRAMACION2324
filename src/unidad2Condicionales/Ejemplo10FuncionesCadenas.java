package unidad2Condicionales;

public class Ejemplo10FuncionesCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String direccion = "      Calle    gorgola 23 23456 burgos spain     ";
		String memRam = "8192MB";
		int dobleMemoria = 0;

		// Ejemplo de funcion charAt, con ella podemos sacar
		// el caracter en le posision indicada
		char quintaPosicion = direccion.charAt(4);

		// Las posiciones empiezan por 0 por lo cual la quinta
		// posicion es el número 4
		System.out.println("La letra en la posicion 5 es " + quintaPosicion);

		/*
		 * La funcion substr (substring) devuelve un corte de
		 * la cadena original sobre la que ejecutamos la
		 * funcion, hay que poner la posicion inicial y la
		 * final
		 */
		System.out.println("La calle es: " + direccion.substring(6, 13));

		/*
		 * La propiedad lenght nos dice cuantas letras tiene el
		 * String
		 */
		System.out.println("La direccion tiene " + direccion.length() + " caracteres");

		// Cortamos el numero de la memoria ram
		memRam = memRam.substring(0, 4);

		// Para convertir un String a un entero usamos parseInt
		// de integer
		// existe un parseDouble de Double y parseFloat de
		// Float
		dobleMemoria = Integer.parseInt(memRam) * 2;

		// Para convertir un numero a String se utiliza el
		// metodo valueOf de
		// la clase String
		memRam = String.valueOf(dobleMemoria);

		// Concat concatena dos cadenas, las dos siguientes
		// expresiones son iguales
		direccion = direccion.concat(" Mundo      ");
		direccion = direccion + " Mundo      ";

		/*
		 * Strip nos elimina los espacios en blanco redundantes
		 * al final de la cadena dejando solo 1
		 */
		System.out.println(direccion + "f");
		// direccion = direccion.strip();
		System.out.println(direccion + "f");

		direccion = direccion.trim();
		System.out.println(direccion);

	}

}
