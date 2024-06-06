package unidad3.examen;

import java.util.Arrays;

public class Familia {

	private String id;
	private String nombre;
	private String direccion;
	public boolean esNumerosa;
	private boolean esMonoParental;
	private int ingresosMensuales;
	private Persona[] listaPersonas;

	public Familia() {

		// Generamos numeros aleatorios para los
		// valores numericos
		this.id = "id" + (int) (Math.random() * 100);
		this.ingresosMensuales = (int) (Math.random() * 4000) + 1000;

		this.nombre = "";
		this.direccion = "";
		// Aleatoriamente sera progenitor o no, si es
		// mayor de 0,5 el aleatorio
		this.esNumerosa = (Math.random() > 0.5 ? true : false);
		this.esMonoParental = (Math.random() > 0.5 ? true : false);

		// TODO Auto-generated constructor stub
	}

	public Familia(String id, String nombre, String direccion, boolean esNumerosa, boolean esMonoParental,
			int ingresosMensuales, Persona[] listaPersonas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.esNumerosa = esNumerosa;
		this.esMonoParental = esMonoParental;
		this.ingresosMensuales = ingresosMensuales;
		this.listaPersonas = listaPersonas;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the esMonoParental
	 */
	public boolean isEsMonoParental() {
		return esMonoParental;
	}

	/**
	 * @param esMonoParental the esMonoParental to set
	 */
	public void setEsMonoParental(boolean esMonoParental) {
		this.esMonoParental = esMonoParental;
	}

	/**
	 * @return the ingresosMensuales
	 */
	public int getIngresosMensuales() {
		return ingresosMensuales;
	}

	/**
	 * @param ingresosMensuales the ingresosMensuales
	 *                          to set
	 */
	public void setIngresosMensuales(int ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}

	/**
	 * @return the listaPersonas
	 */
	public Persona[] getListaPersonas() {
		return listaPersonas;
	}

	/**
	 * @param listaPersonas the listaPersonas to set
	 */
	public void setListaPersonas(Persona[] listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	@Override
	public String toString() {

		String salida = "Familia [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", esNumerosa="
				+ esNumerosa + ", esMonoParental=" + esMonoParental + ", ingresosMensuales=" + ingresosMensuales
				+ ", listaPersonas=" + Arrays.toString(listaPersonas) + "]";

		/*
		 * Este Código es equivalente al
		 * Arrays.toString for (int
		 * i=0;i<listaPersonas.length;i++) { salida =
		 * salida + listaPersonas[i].toString(); }
		 */

		return salida;

	}

	/**
	 * Funcion que nos devuelve la cantidad de personas
	 * de la familia
	 * 
	 * @return el numero de personas, la longitud del
	 *         array
	 */
	public int numPersonas() {
		return this.listaPersonas.length;
	}

	/**
	 * devolverá la cantidad de personas de la familia
	 * con ingreso inferior al introducido como
	 * parámetro (1,5 puntos).
	 * 
	 * @param ingreso
	 * @return un entero con el numero de personas que
	 *         cumplen la condicion
	 */
	public int numPersonasIngresos(int ingreso) {
		// Variable que cuenta las personas con
		// ingresos inferiores a la variable
		// Ingreso que recibo como parametro
		int numPersonas = 0;

		// Recorremos todas las personas de la familia
		// que
		// Estan en el array listaPersonas
		for (int i = 0; i < listaPersonas.length; i++) {
			// Para cada persona comprobamos si su
			// sueldo es menor del recibido por la
			// funcion
			if (listaPersonas[i].getIngresos() < ingreso) {
				numPersonas++;
			}
		}

		return numPersonas;

	}

	/**
	 * Sumará los ingresos de todos los miembros de la
	 * familia y se los asigna a la variable
	 * ingresosMensuales de la familia (1,5 puntos)
	 * 
	 */
	public void sumaIngresos() {
		// Recorro todas las personas de la familia
		// Y voy sumando sus ingresos
		for (int i = 0; i < listaPersonas.length; i++) {

			ingresosMensuales = ingresosMensuales + listaPersonas[i].getIngresos();
		}
	}

	/**
	 * Buscará en el array de personas la que tenga el
	 * nombre introducido cómo parámetro. Si no existe
	 * devolverá falso. Si existe y esProgenitor
	 * también devolverá falso. En caso de que no sea
	 * progenitor cambiará el valor a true y devolverá
	 * true.(1,5 puntos)
	 * 
	 * @param nombre
	 * @param esProgenitor
	 * @return
	 */
	public boolean asignarRolProgenitor(String nombre, boolean esProgenitor) {

		boolean encontrado = false;

		for (int i = 0; i < listaPersonas.length; i++) {

			// Si el nombre esta en nuestra lista
			// entramos en el if
			if (nombre.equalsIgnoreCase(listaPersonas[i].getNombre())) {
				// Si hay una personas con el nombre
				// buscado se ha encontrado
				encontrado = true;

				// Si es progenitor devolvemos falso
				if (listaPersonas[i].isEsProgenitor()) {
					return false;
				} else // Si no es progenitor lo
						// hacemos progenitor y salimos
						// con true
				{
					listaPersonas[i].setEsProgenitor(true);
					return true;
				}
			}

		}
		// Si no hemos encontrado a la persona
		// devolvemos false
		return encontrado;

	}

}
