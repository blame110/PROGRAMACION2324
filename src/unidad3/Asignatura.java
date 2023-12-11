package unidad3;

public class Asignatura {

	private String nombre;
	private String aulas[];
	private String departamento;
	private Persona profesores[];

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
	 * @return the aulas
	 */
	public String[] getAulas() {
		return aulas;
	}

	/**
	 * @param aulas the aulas to set
	 */
	public void setAulas(String[] aulas) {
		this.aulas = aulas;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Asignatura(String nombre, String[] aulas, String departamento, Persona[] profesores) {
		super();
		this.nombre = nombre;
		this.aulas = aulas;
		this.departamento = departamento;
		this.profesores = profesores;
	}

}
