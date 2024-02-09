package unidad3;

public class Ordenador {

	public static final int MONTAJE_CORRECTO = 0;
	public static final int MONTAJE_FALLIDO = -1;

	private String caja;
	private float precio;
	private int altura;
	private String SO;
	private float peso;

	public Componente[] listaComponentes;

	public Ordenador() {

		listaComponentes = new Componente[6];
		// TODO Auto-generated constructor stub

	}

	/**
	 * Comprueba que el ordenador tiene todos los
	 * componentes necesarios (cpu, placa, psu, ram,
	 * disco) y que no haya repetidos ni componenetes
	 * erroneos a montar, y comprobar que los
	 * componentes esten montados en su sitio correcto
	 * 
	 * @return -1 si no esta correcto y 0 si esta
	 *         correcto
	 */
	public int montaje() {

	/*
	 * 1. comprobar que estan todos, crearia booleanos
	 * para cada tipo de componente, recorrerica el
	 * array de componentes (listaComponentes) y cada
	 * vez que haya de un tipo pondria a true un
	 * boolean al final comprobaria que todos los
	 * boolean son ciertos.
	 * 
	 * 
	 * 2. En el mismo bucle anterior, al recorrer
	 * comprobamos que no haya repetidos
	 * 
	 * 
	 * 3. Sabemos si estan en el sitio correcto en cada
	 * posicion del array coincide el tipo con la
	 * posicion en el array
	 * 
	 * 
	 * 
	 * /** Si la suma de los precios de todos los
	 * componentes es mayor que el presupuesto que
	 * recibimos como parametro Entonces devuelve fallo
	 * sino devuelve correcto
	 * 
	 * @param presupuesto
	 * 
	 * @return
	 */
	public int cumplePresupuesto(int presupuesto) {

		// Reccorremos todos los componentes para sumar
		// sus precios
		for (Componente comp : listaComponentes) {
			this.precio += comp.getPrecio();
		}
		// Si la suma es superior al presupuesto
		// devolvemos error
		if (presupuesto < this.precio)
			return -1;

		// Si llega aqui todo ok
		return 0;

	}

}
