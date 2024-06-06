package unidad3.examen;

public class Persona {

	private int id;
	private String nombre;
	private int edad;
	private int ingresos;
	private boolean esProgenitor;

	public Persona() {
		// Generamos numeros aleatorios para los
		// valores numericos
		this.id = (int) (Math.random() * 100);
		this.edad = (int) (Math.random() * 100);
		this.ingresos = (int) (Math.random() * 1000) + 1000;

		this.nombre = "";
		// Aleatoriamente sera progenitor o no, si es
		// mayor de 0,5 el aleatorio
		this.esProgenitor = (Math.random() > 0.5 ? true : false);
	}

	public Persona(int identificador, String nombre, int edad, int ingresos, boolean esProgenitor) {
		super();
		this.id = identificador;
		this.nombre = nombre;
		this.edad = edad;
		this.ingresos = ingresos;
		this.esProgenitor = esProgenitor;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombreRecibido) {
		this.nombre = nombreRecibido;
	}

	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return id;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.id = identificador;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the ingresos
	 */
	public int getIngresos() {
		return ingresos;
	}

	/**
	 * @param ingresos the ingresos to set
	 */
	public void setIngresos(int ingresos) {
		this.ingresos = ingresos;
	}

	/**
	 * @return the esProgenitor
	 */
	public boolean isEsProgenitor() {
		return esProgenitor;
	}

	/**
	 * @param esProgenitor the esProgenitor to set
	 */
	public void setEsProgenitor(boolean esProgenitor) {
		this.esProgenitor = esProgenitor;
	}

	@Override
	public String toString() {

		// Concatenamos todos los valores del objeto
		// formateados y los devolvemos
		String salida = "**************************************************\n";
		salida = salida + "id: " + this.id + "\n";
		salida = salida + "nombre: " + this.nombre + "\n";
		salida = salida + "edad: " + this.edad + "\n";
		salida = salida + "ingresos: " + this.ingresos + "\n";
		salida = salida + "Es Progenitor: " + this.esProgenitor + "\n";
		salida = salida + "**************************************************\n";

		return salida;
	}

}
