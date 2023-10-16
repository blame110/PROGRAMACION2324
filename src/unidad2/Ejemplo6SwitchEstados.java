package unidad2;

import java.util.Scanner;

public class Ejemplo6SwitchEstados {

	// constantes
	// Definimos estados para el jugador
	public static final int ESTADO_SALTANDO = 0;
	public static final int ESTADO_CUBIERTO = 1;
	public static final int ESTADO_INVISIBLE = 2;
	public static final int ESTADO_AGACHADO = 3;

	// Definimos constantes para las acciones
	public static final int ACCION_DISPARAR = 0;
	public static final int ACCION_SALTAR = 1;
	public static final int ACCION_ESCANEO_VISIBILIDAD = 2;

	public static final int ACCION_PERMITIDA = 1;
	public static final int ACCION_NO_PERMITIDA = 0;

	/**
	 * El programa recibe el estado de un personaje y la accion a realizar, y
	 * dependiendo del estado se podra realizar o no
	 * 
	 * El jugador podra disparar si no esta a cubierto El jugador puede saltar si no
	 * esta saltando o invisible El jugador es visible si no es invisible y no esta
	 * a cubierto
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		int estado = -1;
		int accion = -1;

		// Por defecto el resultado es que no se permite la accion
		int resultado = ACCION_NO_PERMITIDA;

		Scanner teclado = new Scanner(System.in);

		// Leemos de teclado los datos
		System.out.println("introduce una accion (0 - Disparar, 1 - Saltar, 2 - Escaneo)");
		accion = teclado.nextInt();

		System.out.println("introduce un estado (0 - Saltando, 1 - A Cubierto, 2 - Invisible, 3 - Agachado)");
		estado = teclado.nextInt();

		// POR HACER POR EL ALUMNO, COMPROBAR QUE LA ACCION Y EL ESTADO
		// SON VALORES CORRECTOS SINO SALIR CON EXIT exit(-1)

		// Dependiendo de la accion comprobamos si puede realizarse
		// comprobando los estados del personaje
		switch (accion) {
		case ACCION_DISPARAR:
			// Si no estoy a cubierto puedo realizar la accion
			if (estado != ESTADO_CUBIERTO)
				resultado = ACCION_PERMITIDA;
			break;
		case ACCION_SALTAR:
			if (estado != ESTADO_SALTANDO && estado != ESTADO_INVISIBLE)
				resultado = ACCION_PERMITIDA;
			break;
		case ACCION_ESCANEO_VISIBILIDAD:
			if (estado != ESTADO_INVISIBLE && estado != ESTADO_CUBIERTO)
				resultado = ACCION_PERMITIDA;
			break;

		}

		if (resultado == ACCION_PERMITIDA)
			System.out.println("La accion puede llevarse a cabo");
		else if (resultado == ACCION_NO_PERMITIDA)
			System.out.println("La accion no puede llevarse a cabo");

		teclado.close();

	}

}
