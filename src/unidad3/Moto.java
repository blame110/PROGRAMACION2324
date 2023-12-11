package unidad3;

public class Moto extends Vehiculo {

	private int presionRuedas;
	private String tipoMoto;
	private double peso;
	private int pulgadaLlanta;

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(int presionRuedas, String tipo, double peso, int pulgadaLlanta) {
		super();
		this.presionRuedas = presionRuedas;
		this.tipoMoto = tipo;
		this.peso = peso;
		this.pulgadaLlanta = pulgadaLlanta;

		// Desde la clase hija se puede acceder a las
		// variables y metodos de la clase padre
		// Los metodos publicos y protegidos
		this.setVelocidad(10);

		this.acelerar(2);
	}

	/**
	 * @return the presionRuedas
	 */
	public int getPresionRuedas() {
		return presionRuedas;
	}

	/**
	 * @param presionRuedas the presionRuedas to set
	 */
	public void setPresionRuedas(int presionRuedas) {
		this.presionRuedas = presionRuedas;
	}

	/**
	 * @return the tipo
	 */
	public String getTipoMoto() {
		return tipoMoto;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipoMoto(String tipo) {
		this.tipoMoto = tipo;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the pulgadaLlanta
	 */
	public int getPulgadaLlanta() {
		return pulgadaLlanta;
	}

	/**
	 * @param pulgadaLlanta the pulgadaLlanta to set
	 */
	public void setPulgadaLlanta(int pulgadaLlanta) {
		this.pulgadaLlanta = pulgadaLlanta;
	}

	@Override
	public String toString() {
		return "Bicicleta [presionRuedas=" + presionRuedas + ", tipo=" + tipoMoto + ", peso=" + peso
				+ ", pulgadaLlanta=" + pulgadaLlanta + "]";
	}

}
