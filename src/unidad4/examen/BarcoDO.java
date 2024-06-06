package unidad4.examen;

public class BarcoDO {

	public static final int VELERO = 1;
	public static final int GALEON = 2;

	private int idBarco;
	private String nombre;
	private String descripcion;
	private int categoria;
	private int eslora;
	private boolean competicion;
	private int peso;
	private int precio;
	private int idCliente;

	public BarcoDO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BarcoDO(int idBarco, String nombre, String descripcion, int categoria, int eslora, boolean competicion,
			int peso, int precio, int idCliente) {
		super();
		this.idBarco = idBarco;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.eslora = eslora;
		this.competicion = competicion;
		this.peso = peso;
		this.precio = precio;
		this.idCliente = idCliente;
	}

	/**
	 * @return the idBarco
	 */
	public int getIdBarco() {
		return idBarco;
	}

	/**
	 * @param idBarco the idBarco to set
	 */
	public void setIdBarco(int idBarco) {
		this.idBarco = idBarco;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the categoria
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the eslora
	 */
	public int getEslora() {
		return eslora;
	}

	/**
	 * @param eslora the eslora to set
	 */
	public void setEslora(int eslora) {
		this.eslora = eslora;
	}

	/**
	 * @return the competicion
	 */
	public boolean isCompeticion() {
		return competicion;
	}

	/**
	 * @param competicion the competicion to set
	 */
	public void setCompeticion(boolean competicion) {
		this.competicion = competicion;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "BarcoDO [idBarco=" + idBarco + ", nombre=" + nombre + ", descripcion=" + descripcion + ", categoria="
				+ categoria + ", eslora=" + eslora + ", competicion=" + competicion + ", peso=" + peso + ", precio="
				+ precio + ", idCliente=" + idCliente + "]";
	}

}
