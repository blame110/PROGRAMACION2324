package unidad3;

public class Partido {

	private String idEquipoLocal;
	private String idEquipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	private int diaPartido;
	private int jornada;

	/**
	 * @return the idEquipoLocal
	 */
	public String getIdEquipoLocal() {
		return idEquipoLocal;
	}

	/**
	 * @param idEquipoLocal the idEquipoLocal to set
	 */
	public void setIdEquipoLocal(String idEquipoLocal) {
		this.idEquipoLocal = idEquipoLocal;
	}

	/**
	 * @return the idEquipoVisitante
	 */
	public String getIdEquipoVisitante() {
		return idEquipoVisitante;
	}

	/**
	 * @param idEquipoVisitante the idEquipoVisitante
	 *                          to set
	 */
	public void setIdEquipoVisitante(String idEquipoVisitante) {
		this.idEquipoVisitante = idEquipoVisitante;
	}

	/**
	 * @return the golesLocal
	 */
	public int getGolesLocal() {
		return golesLocal;
	}

	/**
	 * @param golesLocal the golesLocal to set
	 */
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	/**
	 * @return the golesVisitante
	 */
	public int getGolesVisitante() {
		return golesVisitante;
	}

	/**
	 * @param golesVisitante the golesVisitante to set
	 */
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	/**
	 * @return the diaPartido
	 */
	public int getDiaPartido() {
		return diaPartido;
	}

	/**
	 * @param diaPartido the diaPartido to set
	 */
	public void setDiaPartido(int diaPartido) {
		this.diaPartido = diaPartido;
	}

	/**
	 * @return the jornada
	 */
	public int getJornada() {
		return jornada;
	}

	/**
	 * @param jornada the jornada to set
	 */
	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public Partido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Partido(String idEquipoLocal, String idEquipoVisitante, int golesLocal, int golesVisitante, int diaPartido,
			int jornada) {
		super();
		this.idEquipoLocal = idEquipoLocal;
		this.idEquipoVisitante = idEquipoVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.diaPartido = diaPartido;
		this.jornada = jornada;
	}

	@Override
	public String toString() {
		return "Partido [idEquipoLocal=" + idEquipoLocal + ", idEquipoVisitante=" + idEquipoVisitante + ", golesLocal="
				+ golesLocal + ", golesVisitante=" + golesVisitante + ", diaPartido=" + diaPartido + ", jornada="
				+ jornada + "]";
	}

}
