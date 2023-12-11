package unidad3;

/**
 * La clase representa a un vehiculo Tiene los datos de
 * numero de ruedas velocidad maxima potencia tipo
 * (gasolina, gas, electrico, hibrido, pedales, marino,
 * * aereo) utilizar constantes capacidad carga
 */
public class Vehiculo {

	// Constantes de la clase
	public static final int TIPO_GASOLINA = 1;
	public static final int TIPO_GAS = 2;
	public static final int TIPO_ELECTRICO = 3;
	public static final int TIPO_HIBRIDO = 4;
	public static final int TIPO_PEDALES = 5;
	public static final int TIPO_AEREO = 6;
	public static final int TIPO_MARINO = 7;

	private int numRuedas;
	private int velMax;
	private double potencia;
	private int tipo;
	private int velocidad;
	private double cargaMax;

	public Vehiculo() {
		super();
		numRuedas = 4;
		// TODO Auto-generated constructor stub
	}

	public Vehiculo(int numRuedas, int velMax, double potencia, int tipo, int velocidad, double cargaMax) {
		super();
		this.numRuedas = numRuedas;
		this.velMax = velMax;
		this.potencia = potencia;
		this.tipo = tipo;
		this.cargaMax = cargaMax;
		this.velocidad = velocidad;
	}

	// Un metodo con el modificador protegido no es ni
	// privado ni publico, se puede utilizar sólo
	// en las clases hijas
	protected void acelerar(int aceleracion) {

		this.velocidad = aceleracion * this.velocidad;

	}

	/**
	 * @return the numRuedas
	 */
	public int getNumRuedas() {
		return numRuedas;
	}

	/**
	 * @param numRuedas the numRuedas to set
	 */
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	/**
	 * @return the velMax
	 */
	public int getVelMax() {
		return velMax;
	}

	/**
	 * @param velMax the velMax to set
	 */
	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the cargaMax
	 */
	public double getCargaMax() {
		return cargaMax;
	}

	/**
	 * @param cargaMax the cargaMax to set
	 */
	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}

	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

}
