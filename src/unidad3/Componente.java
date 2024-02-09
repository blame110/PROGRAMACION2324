package unidad3;

public class Componente {

	public static final int TIPO_CPU = 0;
	public static final int TIPO_MEMORIA = 1;
	public static final int TIPO_DISCO = 2;
	public static final int TIPO_PLACA = 3;
	public static final int TIPO_GRAFICA = 4;
	public static final int TIPO_PSU = 5;
	public static final int TIPO_ERRONEO = -1;

	private int tipo;
	private float precio;
	private String marca;
	private String modelo;
	private int tamanio;

	public Componente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor que recibe todos los valores de la
	 * clase y comprueba que es correcto
	 * 
	 * @param tipo
	 * @param precio
	 * @param marca
	 * @param modelo
	 * @param tamanio
	 */
	public Componente(int tipo, float precio, String marca, String modelo, int tamanio) {
		super();

		this.precio = precio;
		this.marca = marca;
		this.modelo = modelo;
		this.tamanio = tamanio;

		// Comprobamos que el tipo es correcto

		if (tipo >= 1 && tipo <= 6)
			this.tipo = tipo;
		else
			this.tipo = -1;
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
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the tamanio
	 */
	public int getTamanio() {
		return tamanio;
	}

	/**
	 * @param tamanio the tamanio to set
	 */
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Componente [tipo=" + tipo + ", precio=" + precio + ", marca=" + marca + ", modelo=" + modelo
				+ ", tamanio=" + tamanio + "]";
	}

}
