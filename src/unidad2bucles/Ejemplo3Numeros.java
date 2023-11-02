package unidad2bucles;

public class Ejemplo3Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Bucle que muestra todos los numeros pares de 1 a 30
		for (int i = 1; (i > -1); i++) {
			// Si la i es par la mostramos por pantalla
			if (i % 2 == 0)
				System.out.println(i);

			// Ejemplo de break, salimos cuando cumple que es 1000 la i
			// IMPORTANTE JAMAS UTILIZAR ES INOPTIMO NO ES BUENA PRACTICA EVITAR ,CACA
			if (i == 1000)
				break;

		}

		// Bucle que saca los multiplos de 5
		// Si vamos sumando en vez de comprobar es mucho más rapido y optimo
		for (int i = 5; i <= 100; i = i + 5) {
			System.out.println(i);
		}

	}

}
