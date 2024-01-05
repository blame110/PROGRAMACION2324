package unidad3;

public class Jugador {

	// Constantes de posicion en el campo
	public static final int PORTERO = 0;
	public static final int DEFENSA = 1;
	public static final int LATERAL = 2;
	public static final int CENTRAL = 3;
	public static final int DELANTERO = 4;

	// Variables miembro
	public static int numJ = 0;
	private String id;
	private String nombre;
	private int posicion;
	private int numGoles;
	private int edad;

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
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the numGoles
	 */
	public int getNumGoles() {
		return numGoles;
	}

	/**
	 * @param numGoles the numGoles to set
	 */
	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
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

	// Modificado creamos datos aleatorios cuando
	// creamos un nuevo jugador
	public Jugador() {
		super();
		Jugador.numJ++;
		this.id = Integer.toString(Jugador.numJ);
		this.nombre = "Jugador" + Jugador.numJ;
		this.posicion = (int) (Math.random() * 5);
		this.numGoles = (int) (Math.random() * 25);
		this.edad = (int) (Math.random() * 30) + 18;
		// TODO Auto-generated constructor stub
	}

	public Jugador(String id, String nombre, int posicion, int numGoles, int edad) {
		super();
		Jugador.numJ++;
		this.id = id;
		this.nombre = nombre;
		this.posicion = posicion;
		this.numGoles = numGoles;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", posicion=" + posicion + ", numGoles=" + numGoles
				+ ", edad=" + edad + "]";
	}

}
