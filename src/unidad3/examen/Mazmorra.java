package unidad3.examen;

public class Mazmorra {

	private String nombre;
	private int tamanio;
	private String clima;
	private int niveles;

	public Trampa listaTra[];
	public Monstruo listaMon[];

	public Mazmorra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mazmorra(String nombre, int tamanio, String clima, int nivel, Trampa[] listaTra, Monstruo[] listaMon) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.clima = clima;
		this.niveles = nivel;
		this.listaTra = listaTra;
		this.listaMon = listaMon;
	}

	/**********************************
	 * FUNCIONES
	 *********************************/
	/**
	 * La función comprobará que todas las trampas
	 * estén activas y que no haya más de 3 trampas en
	 * el nivel pasado como parámetro. Para comprobar
	 * las trampas se deberá utilizar un bucle for que
	 * no utilice índice para recorrerlo.
	 * 
	 * @param nivel
	 * @return
	 */
	public boolean regularTrampas(int nivel) {
		// Recorremos todas las trampas para 1.
		// comprobar que esten todas activas
		// y 2, contar las del nivel que entra como
		// parametro

		int numTrampas = 0;

		for (Trampa t : listaTra) {
			// Si no esta activa bum
			if (!t.activa)
				return false;

			if (t.getNivel() == nivel) {
				numTrampas++;
				// Si hay mas de 3 bum
				if (numTrampas > 3)
					return false;

			}

		}
		// Si llegamos aqui estan todas activadas
		// Y no hay mas de 3 en el nivel
		return true;
	}

	/**
	 * Esta función dejará claro cual es el final boss
	 * de la mazmorra. Deberá de ser el koala negro o
	 * dragon con más ataque y, seamos serios, no puede
	 * ser debil a las cosquillas.
	 * 
	 * Devolverá el monstruo encontrado, si no hay
	 * ninguno de esas características, creará un
	 * monstruo horripilante en el nivel 3 que cumpla
	 * los requisitos, lo meterá al final de la
	 * mazmorra (última posición de la listaMonstruos)
	 * y lo devolverá.
	 * 
	 * @return
	 */
	public Monstruo enemigoFinal() {

		// Recorremos el array de monstruos buscando
		// El que tenga mayor ataque
		int maxAtaqueMon = Integer.MIN_VALUE;
		int posMon = -1;

		for (int i = 0; i < listaMon.length; i++) {
			// Si el monstruo actual en la pos i
			// Tiene mas ataque que el máximo es el
			// nuevo final boss posbible
			if (listaMon[i].getAtaque() > maxAtaqueMon) {
				// Si el monstruo tiene mas ataque que
				// nuestra maximo anterior
				// Tenemos que guardar ese ataque
				// maximo y la posicion
				maxAtaqueMon = listaMon[i].getAtaque();
				posMon = i;
			}
		}

		// Para ser el final boss tiene que no tener
		// cosquillas y ser dragon o koala
		if (listaMon[posMon].getDebilidad() != Monstruo.COSQUILLAS && (listaMon[posMon].getTipo() == Monstruo.DRAGONES
				|| listaMon[posMon].getTipo() == Monstruo.DARK_KOALA)) {
			// Devolvemos al monstruo
			return listaMon[posMon];
		}

		// Si seguimos implica que en la lista de
		// monstruos ninguno cumple
		// Las condiciones de final boss
		Monstruo terribilisFinale = new Monstruo("Doymiedo", Monstruo.DRAGONES, Monstruo.AGUA, 233, 345, 3, 34);

		// Lo metemos en la lista en la ultima posicion
		listaMon[listaMon.length - 1] = terribilisFinale;

		// Devolvemos el monstruo
		return terribilisFinale;

	}

	/**
	 * La función comprobará lo siguiente:
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Debe de haber al menos un monstruo de cada tipo
	 * 
	 * 
	 * 
	 * @return
	 */
	public boolean comprobarMazmorra() {

		boolean dragonNivel3 = false;

		int numTramN1 = 0;
		int numTramN2 = 0;
		int numTramN3 = 0;

		int numMonN1 = 0;
		int numMonN2 = 0;
		int numMonN3 = 0;

		// Cada posicion de este array sera un tipo de
		// monstruo
		// Por defecto los ponemos a false que indica
		// que no hay monstruos de ese tipo
		// Cuando encontramos un monstruo de ese tipo
		// lo pondremos a true
		boolean hayMonstruos[] = { false, false, false, false, false };

		// Recorremos los monstruos
		for (Monstruo mon : this.listaMon) {

			// Si hay un dragon en el nivel 3 ponemos a
			// true la condicion
			if (mon.getNivel() == 3 && mon.getTipo() == Monstruo.DRAGONES)
				dragonNivel3 = true;

			// Dependiendo del nivel vamos contando los
			// monstruos
			switch (mon.getNivel()) {
			case 1:
				numMonN1++;
				break;
			case 2:
				numMonN2++;
				break;
			case 3:
				numMonN3++;
				break;
			default:
				// Si hay un bicho fuera de los niveles
				// 1 2
				// 3 bum
				return false;
			}

			// Dependiendo del tipo de monstruo ponemos
			// a
			// true su existencia en la mazmorra

			if (mon.getTipo() >= 0 && mon.getTipo() <= 4)
				hayMonstruos[mon.getTipo()] = true;

			/*
			 * switch (mon.getTipo()) {
			 * 
			 * case Monstruo.DRAGONES:
			 * hayMonstruos[Monstruo.DRAGONES] = true;
			 * break; ... }
			 */

		}

		// Recorremos todos los tipos de monstruos
		// encontrados
		/// Si alguno no se ha encontrado no cumple la
		// condicion bum
		for (boolean hayTipoMon : hayMonstruos) {
			if (!hayTipoMon)
				return false;
		}

		// Si no se ha encontrado el dragon en el nivel
		// 3 boom
		if (!dragonNivel3)
			return false;

		// Recorremos las trampas
		for (Trampa tra : this.listaTra) {

			// Si hay una trampa no activa bum
			if (!tra.activa)
				return false;

			// Dependiendo del nivel vamos contando las
			// trampas
			switch (tra.getNivel()) {
			case 1:
				numTramN1++;
				break;
			case 2:
				numTramN2++;
				break;
			case 3:
				numTramN3++;
				break;
			default:
				// Si hay una trampa fuera de los
				// niveles 1
				// 2 3 bum
				return false;
			}

		}

		// Comprobamos el numero de trampas por nivel
		if (numTramN1 < 2 || numTramN2 < 2 || numTramN3 < 2)
			return false;

		// Comprobamos el numero de trampas por nivel
		if (numMonN1 < 3 || numMonN2 < 3 || numMonN3 < 3)
			return false;

		// Si llegamos aqui y no hemos hecho boom esta
		// todo perfecto
		return true;

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

	/**
	 * @return the clima
	 */
	public String getClima() {
		return clima;
	}

	/**
	 * @param clima the clima to set
	 */
	public void setClima(String clima) {
		this.clima = clima;
	}

	/**
	 * @return the nivel
	 */
	public int getNivel() {
		return niveles;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.niveles = nivel;
	}

	@Override
	public String toString() {
		return "Mazmorra [nombre=" + nombre + ", tamanio=" + tamanio + ", clima=" + clima + ", nivel=" + niveles + "]";
	}

}
