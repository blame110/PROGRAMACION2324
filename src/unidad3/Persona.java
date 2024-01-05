package unidad3;

public class Persona {

	// Atributos miembro de la clase Persona
	private String nombre;
	private int edad;
	private double peso;
	private boolean vivo;
	private int altura;
	public static int numPersonas = 0;

	/**
	 * Metodo Constructor Es el que se ejecuta cuando
	 * creamos un objeto con new Persona Este
	 * constructor se denomina el constructor vacio ya
	 * que no recibe ningun dato como parametro
	 */
	public Persona() {

		// This sirve para llamar a los atributos de la
		// clase
		this.nombre = "Persona" + ((int) (Math.random() * 100));
		this.edad = (int) (Math.random() * 82) + 18;
		this.peso = (int) (Math.random() * 40) + 50;
		this.vivo = Math.random() > 0.1;
		// Cuando creamos una nueva persona
		// incrementamos la cantidad de personas en
		// funcionamiento
		this.numPersonas++;

	}

	/**
	 * Constructor que recibe los datos y los asigna
	 * 
	 * @param nombreR nombre
	 * @param edadR
	 * @param pesoR
	 * @param vivoR
	 */
	public Persona(String nombreR, int edadR, double pesoR, boolean vivoR) {
		// Asignamos los datos que recibimos a las
		// variables
		// miembro
		this.nombre = nombreR;
		this.edad = edadR;
		this.peso = pesoR;
		this.vivo = vivoR;
		// Cuando creamos una nueva persona
		// incrementamos la cantidad de personas en
		// funcionamiento
		this.numPersonas++;
	}

	public void morirse() {
		this.vivo = false;
		numPersonas--;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", vivo=" + vivo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
		// Si lo ponemos a muerto eliminamos uno de la
		// cantidad de personas
		if (!vivo)
			numPersonas--;
	}

	public void setNombre(String nombreN) {
		this.nombre = nombreN;
	}

}
