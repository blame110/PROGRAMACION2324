package unidad2bucles;

public class Ejemplo6Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * El password debera cumplir lo siguiente Como mínimo 9 caracteres Sólo puede
		 * empezar por letras Tiene que tener mayusculas y minusculas Tiene que tener
		 * numeros
		 */

		// Variables
		String password = "hDFAdadsasd23";
		boolean esValido = false;
		boolean longMinOk = false;
		boolean empLetOk = false;
		boolean mayOk = false;
		boolean minOk = false;
		boolean tieneNumOk = false;

		// Comprobamos si cumple la longitud mínima
		if (password.length() >= 9)
			longMinOk = true;

		// Verificamos si empieza por letra
		char primeraLetra = password.charAt(0);
		if (Character.isAlphabetic(primeraLetra))
			empLetOk = true;

		// Recorremos todos los caracteres del password
		for (int i = 0; i < password.length(); i++) {

			// Comprobamos si el caracter actual es un numero
			// si lo es implica que cumple la regla de tener un número al menos
			if (Character.isDigit(password.charAt(i))) {
				tieneNumOk = true;
			}

			// Comprobamos si hay mayusculas
			if (Character.isUpperCase(password.charAt(i))) {
				mayOk = true;
			}

			// Comprobamos si hay minusculas
			if (Character.isLowerCase(password.charAt(i))) {
				minOk = true;
			}

		}

		// La contraseña será valida sólo si cumple todas las condiciones
		if (longMinOk && empLetOk && tieneNumOk && mayOk && minOk)
			esValido = true;

		System.out.println("Tiene mas de 8 caracteres: " + longMinOk);
		System.out.println("Empieza por letra: " + empLetOk);
		System.out.println("Tiene números " + tieneNumOk);
		System.out.println("Tiene una mayuscula : " + mayOk);
		System.out.println("Tiene una minusculas : " + minOk);
		System.out.print("Por lo cual la contraseña ");
		System.out.println((esValido ? "es válida" : "no es válida"));

	}

}
