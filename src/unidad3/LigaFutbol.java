package unidad3;

import java.util.Arrays;

public class LigaFutbol {

	// Constante con el numero de equipos participantes
	// en la liga
	public static final int NUM_EQUIPOS = 18;

	private String nombre;
	private String pais;
	private int jornadaActual;

	private Equipo listaEquipos[];
	private Partido listaPartidos[];

	public LigaFutbol() {
		super();
		// TODO Auto-generated constructor stub
		this.nombre = "Liga BBVa";
		this.pais = "España";
		this.jornadaActual = 20;

		// Definimos el tamaño del array de equipos de
		// la liga
		this.listaEquipos = new Equipo[this.NUM_EQUIPOS];

		// Voy creando equipos y los meto en la
		// posicion
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

	/**
	 * 
	 * int listaNum[] = {5,23,2,12,4,1}
	 * 
	 * int listaOrdenada[]
	 */
	/**
	 * La funcion recibe una lista de equipos y los
	 * ordena por puntos
	 * 
	 * @param ListaEquipos Lista de equipos
	 * @return La lista de equipos ordenada
	 */
	public Equipo[] ordenarEquipos(Equipo listaEq[]) {

		for (int j = 0; j < listaEq.length; j++) {
			// Recorremos la lista de equipos para
			// irlos cambiando de posicion
			for (int i = 0; i < listaEq.length - 1; i++) {

				// Si el equipo en la siguiente
				// posicion tiene mas puntos nos
				// cambiamos
				if (listaEq[i + 1].getPuntos() > listaEq[i].getPuntos()) {
					// Cambiamos de posicion
					// Primero salvamos el equipo de la
					// pos i
					Equipo eqTemp = listaEq[i];
					// Ponemos el de la pos i+1 en la
					// pos i
					listaEq[i] = listaEq[i + 1];
					// Por ultimo el equipo de pos i
					// guardado en la temporal lo
					// ponemos en pos i+1
					listaEq[i + 1] = eqTemp;
				}
			}
		}

		// Devuelvo la lista de equipos
		return listaEq;
	}

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
		// Arrays.sort(this.listaEquipos);
		this.listaEquipos = ordenarEquipos(this.listaEquipos);

		// Mostramos todos los equipos
		// Modificado el limite a posiciones
		for (int i = 0; i < posiciones; i++) {
			System.out.println(listaEquipos[i].getNombre() + " " + listaEquipos[i].getPuntos());
		}

	}

	/**
	 * La funcion recorre todos los equipos y dentro de
	 * cada equipo todos los jugadores Buscando el
	 * jugador con mas goles
	 * 
	 * @return El jugador con mas goles
	 */
	public Jugador pichichi() {
		// Creo el jugador a devolver
		Jugador pichichi = new Jugador();
		// Inicializamos el maximo al menor valor
		// posible
		int numGolMax = Integer.MIN_VALUE;
		// Recorremos los equipos de la liga
		for (int i = 0; i < this.listaEquipos.length; i++) {
			// Para cada equipo recorremos sus
			// jugadores
			Jugador[] listaJug = this.listaEquipos[i].getListaJugadores();
			for (int j = 0; j < listaJug.length; j++) {
				// Si el jugador actual ha marcado mas
				// goles que nuestro maximo
				// Es el nuevo pichichi
				if (listaJug[j].getNumGoles() > numGolMax) {
					// Asignamos el jugador al objeto
					// pichichi
					pichichi = listaJug[j];
					// Actualizamos el maximo
					numGolMax = listaJug[j].getNumGoles();

				}

			}

		}

		// Devuelvo el maximio anotador
		return pichichi;
	}

	/**
	 * Equipos Descenso: Devuelve array equipos que
	 * descienden, siempre descienden 3 equipos.
	 * primero serán los que tengan menos de 6
	 * millones, si hay hueco libre despues los que no
	 * hayan marcado más de 4 goles, y si no los tres
	 * últimos.
	 * 
	 * @return
	 */
	// PORHACER
	public Equipo[] enDescenso() {

		// Definimos el array de equipos que va
		// descender
		Equipo[] equiposDescenso = new Equipo[3];
		// Variable para ir insertando los equipos que
		// descienden
		int posDes = 0;

		// Recorremos todos los equipos
		for (int i = 0; i < this.listaEquipos.length; i++) {
			// Primero comprobamos si el equipo no
			// tiene presupuesto
			// this.listaEquipos[i].getPresupuesto()

			// despues en otro bucle metemos los que no
			// han marcado mas de 4 goles
			// this.listaEquipos[i].getNumGoles()
		}

		// Devolvemos la lista de equipos que desciende
		return equiposDescenso;

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
