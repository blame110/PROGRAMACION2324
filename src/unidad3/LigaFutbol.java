package unidad3;

import java.util.Arrays;

public class LigaFutbol {

	public static final int NUM_EQUIPOS = 18;

	private String nombre;
	private String pais;
	private int jornadaActual;

	private Equipo listaEquipos[];
	private Partido listaPartidos[];

	public LigaFutbol() {
		super();
		// TODO Auto-generated constructor stub
		this.nombre = "Equipo" + ((int) Math.random() * 1000);
		this.pais = "España";
		this.jornadaActual = 20;

		this.listaEquipos = new Equipo[this.NUM_EQUIPOS];
		for (int i = 0; i < listaEquipos.length; i++) {
			Equipo eqTemp = new Equipo();
			listaEquipos[i] = eqTemp;
		}
	}

	public LigaFutbol(String nombre, String pais, Equipo[] listaEquipos, Partido[] listaPartidos) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.listaEquipos = listaEquipos;
		this.listaPartidos = listaPartidos;
	}

	// Funcion que muestra la clasificacion actual de
	// la liga, podemos meter parametro opcional

	// Funcion mostrar partidos de una jornada en
	// particulas

	// Funcion partidoFinalizado

	/**
	 * La funcion mostrara por pantalla los equipos
	 * ordenados por puntos, mostrara posiciones
	 * equipos, si posiciones es 0 Mostrará todos
	 * 
	 * @param posiciones
	 */
	public void mostrarClasificacion(int posiciones) {

		// Si posiciones es 0 lo inincializo al tamaño
		// del array
		if (posiciones == 0)
			posiciones = this.listaEquipos.length;

		// Ordenamos la lista de equipos de la liga
		Arrays.sort(this.listaEquipos);

		// Mostramos todos los equipos
		// Modificado el limite a posiciones
		for (int i = 0; i < posiciones; i++) {
			System.out.println(listaEquipos[i].getNombre() + " " + listaEquipos[i].getPuntos());
		}

	}

	// Funcion ordenar listaEquipos segun los puntos

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
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the listaEquipos
	 */
	public Equipo[] getListaEquipos() {
		return listaEquipos;
	}

	/**
	 * @param listaEquipos the listaEquipos to set
	 */
	public void setListaEquipos(Equipo[] listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	/**
	 * @return the listaPartidos
	 */
	public Partido[] getListaPartidos() {
		return listaPartidos;
	}

	/**
	 * @param listaPartidos the listaPartidos to set
	 */
	public void setListaPartidos(Partido[] listaPartidos) {
		this.listaPartidos = listaPartidos;
	}

	@Override
	public String toString() {
		return "LigaFutbol [nombre=" + nombre + ", pais=" + pais + ", listaEquipos=" + Arrays.toString(listaEquipos)
				+ ", listaPartidos=" + Arrays.toString(listaPartidos) + "]";
	}

}
