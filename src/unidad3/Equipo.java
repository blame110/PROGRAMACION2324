package unidad3;

import java.util.Arrays;

//La clase para poder ser ordenada y implementar el metodo compareto
//Hay que definir que implementa comparable
public class Equipo implements Comparable<Equipo> {

	public static int numE = 0;
	private String id;
	private String nombre;
	private int puntos;
	private int numGoles;
	private int numGolesRec;
	private int presupuesto;
	private String estadio;

	private Jugador listaJugadores[];

	/**
	 * 
	 * Funcion que recibe un jugador y lo añade a
	 * nuestra lista de jugadores Buscara el primer
	 * espacio vacio de nuestro array para insertarlo
	 * 
	 * @param nuevoJugador
	 * @return
	 */
	public int addJugador(Jugador nuevoJugador) {

		for (int i = 0; i < this.listaJugadores.length; i++) {
			// Buscamos la primera posicion nula
			if (this.listaJugadores[i] == null) {
				// Cuando encontramos el hueco metemos
				// al jugador y salimos
				this.listaJugadores[i] = nuevoJugador;
				return 0;
			}
		}

		// Si no hay hueco damos fallo
		return -1;
	}

	/**
	 * Funcion que busca un jugador en un equipo
	 * contrario y devuelve la posicion dentro de su
	 * lista de jugadores
	 * 
	 * @param idJugador
	 * @param equipo
	 * @return
	 */
	public int buscarJugador(String idJugador, Equipo equipo) {
		// Ver si el jugador esta en el equipo si no
		// devuelvo -1
		// Recorremos la lista de jugadores del equipo
		// buscando el idJugador
		Jugador listaJugEquipo[] = equipo.getListaJugadores();
		// Si el jugador no esta en la lista
		// devolveremos -1
		// Por eso inicializamos la posicion a ese
		// valor
		int posJug = -1;
		boolean jugEncontrado = false;

		// Recorremos todos los jugadores del equipo
		// rival
		for (int i = 0; i < listaJugEquipo.length && !jugEncontrado; i++) {

			// Si el id buscado esta en el jugador de
			// la posicion i
			if (listaJugEquipo[i].getId() == idJugador) {
				posJug = i;
				jugEncontrado = true;

			}
		}

		// Devolvemos la posicion del jugador
		return posJug;
	}

	// Fichaje a un jugador de otro equipo
	/**
	 * La función ficha a un jugador del equipo que
	 * recibe como parametro
	 * 
	 * @param idJugador identificador del jugador a
	 *                  buscar
	 * @param equipo    Equipo del cual fichamos
	 * @return 0 si ha podido ficharlo y -1 si no
	 */
	public int ficharJugador(String idJugador, Equipo equipo) {

		// Primer paso ver si el equipo existe, sino
		// devuelvo -1
		if (equipo == null)
			return -1;

		// Segundo paso es buscar al jugador
		int posJug = buscarJugador(idJugador, equipo);

		// elimino el jugador de su lista de jugadores
		// Cargamos la lista de jugadores del equipo
		// contrario
		Jugador listaEquipoF[] = equipo.getListaJugadores();

		// Añadimos al jugador a nuestra lista
		addJugador(listaEquipoF[posJug]);

		// Eliminamos poniendo a null el jugador
		listaEquipoF[posJug] = null;

		return 0;

	}

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
	 * @return the puntos
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * @return the listaJugadores
	 */
	public Jugador[] getListaJugadores() {
		return listaJugadores;
	}

	/**
	 * @param listaJugadores the listaJugadores to set
	 */
	public void setListaJugadores(Jugador[] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
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
	 * @return the numGolesRec
	 */
	public int getNumGolesRec() {
		return numGolesRec;
	}

	/**
	 * @param numGolesRec the numGolesRec to set
	 */
	public void setNumGolesRec(int numGolesRec) {
		this.numGolesRec = numGolesRec;
	}

	/**
	 * @return the presupuesto
	 */
	public int getPresupuesto() {
		return presupuesto;
	}

	/**
	 * @param presupuesto the presupuesto to set
	 */
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	/**
	 * @return the estadio
	 */
	public String getEstadio() {
		return estadio;
	}

	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	// Cambiado, creamos un equipo aleatorio si no
	// recibe parametros
	public Equipo() {
		super();
		this.numE++;
		// TODO Auto-generated constructor stub
		this.id = Integer.toString(this.numE);
		this.nombre = "Equipo" + this.numE;
		this.puntos = (int) (Math.random() * 30) + 12;
		this.numGoles = (int) (Math.random() * 30) + 12;
		this.numGolesRec = (int) (Math.random() * 30) + 12;
		this.presupuesto = (int) (Math.random() * 30);
		this.estadio = "estadio" + this.numE;

		// Creamos 20 jugadores aleatorios
		this.listaJugadores = new Jugador[20];
		for (int i = 0; i < listaJugadores.length; i++) {
			Jugador jugTem = new Jugador();
			listaJugadores[i] = jugTem;
		}

	}

	public Equipo(String id, String nombre, int puntos, int numGoles, int numGolesRec, int presupuesto,
			String estadio) {
		super();
		this.numE++;
		this.id = id;
		this.nombre = nombre;
		this.puntos = puntos;
		this.numGoles = numGoles;
		this.numGolesRec = numGolesRec;
		this.presupuesto = presupuesto;
		this.estadio = estadio;
	}

	// Para poder ordenar y comparar elemenots de una
	// clase
	// necesitamos crear el metodo compareTO

	// Tiene que estar marcado como override
	@Override
	public int compareTo(Equipo otro) {

		// Si mi equipo tiene mas puntos va delante
		if (this.puntos > otro.getPuntos())
			return -1;

		// Si el otro equipo tiene mas puntos va
		// delante
		if (this.puntos < otro.getPuntos())
			return 1;

		// Si los dos objetos tienen los mismos puntos
		// Van en la misma posicion
		return 0;

	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", puntos=" + puntos + ", numGoles=" + numGoles
				+ ", numGolesRec=" + numGolesRec + ", presupuesto=" + presupuesto + ", estadio=" + estadio
				+ ", listaJugadores=" + Arrays.toString(listaJugadores) + "]";
	}

}
