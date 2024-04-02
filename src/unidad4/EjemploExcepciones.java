package unidad4;

import unidad4.excepciones.DividirPorCeroException;

public class EjemploExcepciones {

	// La funcion lanza la excepcion dividir por cero
	// en caso de que el divisor sea 0
	public static int dividir(int dividendo, int divisor) throws DividirPorCeroException {

		// Si el divisor es 0 lanzo la excepcion
		if (divisor == 0)
			throw new DividirPorCeroException("El divisor es 0");

		return dividendo / divisor;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {

			int listaNumeros[] = { 2, 3 };

			int division = dividir(43, 0);

			System.out.println("El numero en la pos 25 es " + listaNumeros[25]);

		} catch (ArrayIndexOutOfBoundsException obe) {
			System.out.println("HA habido un problema con el array, caballero");

		} catch (DividirPorCeroException dpoe) {
			dpoe.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("Ha habido un error");
		} finally {
			System.out.println("Codigo que se ejecuta tanto si hay error como si todo va bien");
		}

		System.out.println("Seguimo palante");
	}

}
