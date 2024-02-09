package unidad3.examen;

public class Monstruo {

	public static final int TROLL = 0;
	public static final int DRAGONES = 1;
	public static final int DARK_KOALA = 2;
	public static final int ANKLE_SUCKWORM = 3;
	public static final int SLIME = 4;

	public static final int FUEGO = 0;
	public static final int AGUA = 1;
	public static final int COSQUILLAS = 2;
	public static final int GATITOS_EXPLOSIVOS = 3;

	private String nombre;
	private int tipo;
	private int debilidad;
	private int pv;
	private int ataque;
	private int nivel;
	private int tamanio;

	public Monstruo() {
		super();

		this.nombre = "Monstruo" + ((int) Math.random() * 100);
		this.tipo = (int) (Math.random() * 5);
		this.debilidad = (int) (Math.random() * 4);
		this.pv = (int) (Math.random() * 500) + 100;
		this.ataque = (int) (Math.random() * 20);
		this.nivel = (int) (Math.random() * 3) + 1;
		this.tamanio = (int) (Math.random() * 20);

		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param nombre
	 * @param tipo
	 * @param debilidad
	 * @param pv
	 * @param ataque
	 * @param nivel
	 * @param tamanio
	 */
	public Monstruo(String nombre, int tipo, int debilidad, int pv, int ataque, int nivel, int tamanio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.debilidad = debilidad;
		this.pv = pv;
		this.ataque = ataque;
		this.nivel = nivel;
		this.tamanio = tamanio;
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
	 * @return the debilidad
	 */
	public int getDebilidad() {
		return debilidad;
	}

	/**
	 * @param debilidad the debilidad to set
	 */
	public void setDebilidad(int debilidad) {
		this.debilidad = debilidad;
	}

	/**
	 * @return the pv
	 */
	public int getPv() {
		return pv;
	}

	/**
	 * @param pv the pv to set
	 */
	public void setPv(int pv) {
		this.pv = pv;
	}

	/**
	 * @return the ataque
	 */
	public int getAtaque() {
		return ataque;
	}

	/**
	 * @param ataque the ataque to set
	 */
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
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
		return "Monstruo [nombre=" + nombre + ", tipo=" + tipo + ", debilidad=" + debilidad + ", pv=" + pv + ", ataque="
				+ ataque + ", nivel=" + nivel + ", tamanio=" + tamanio + "]";
	}

}
