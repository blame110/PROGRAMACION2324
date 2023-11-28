package pruebas;

import java.util.ArrayList;

public class EjemploBombaNuclear {

	public static String alphabetWar(String battlefield) {

		String resultado = "";
		String refugioTemp = "";
		String externos = "";
		boolean hayBombas = false;
		boolean enRefugio = false;
		int numBombas = 0;
		ArrayList<String> listaRef = new ArrayList<String>();
		boolean dentroRef = false;

		System.out.println(battlefield);
		// Recorremos todos los elementos
		for (int i = 0; i < battlefield.length(); i++) {

			// Si entramos en refugio guardamos el refugio
			if (battlefield.charAt(i) == '[') {

				// Añadimos una marca a los externos del refugio
				externos += ".";

				// Si no hay bombas
				if (numBombas < 2) {

					// Guardamos todos los que estan dentro
					int j = i + 1;
					while (battlefield.charAt(j) != ']') {
						refugioTemp += battlefield.charAt(j);
						j++;
					}

					// Adelantamos la i hasta salir del refugio
					i = j;

					// Buscamos el siguiente refugio
					while (j < battlefield.length() && battlefield.charAt(j) != '[') {
						if (battlefield.charAt(j) == '#') {
							// Marcamos que hay bombas
							numBombas++;

						}
						j++;
					}

					// Si hay menos de dos bombas añadimos el refugio
					// seguro
					if (numBombas < 2) {
						listaRef.add(refugioTemp);
						refugioTemp = "";
					}
				} else {
					// Si hay bombas
					refugioTemp = "";
					numBombas = 0;
				}
			}

			if (battlefield.charAt(i) == '#') {
				// Marcamos que hay bombas
				hayBombas = true;
				numBombas++;

			}
			// Guardamos los que estan fuera del refugio
			if (battlefield.charAt(i) != '[' && battlefield.charAt(i) != '#' && battlefield.charAt(i) != ']')
				externos += battlefield.charAt(i);

		}

		System.out.println(externos);

		// Creamos la cadena final
		if (!hayBombas) {
			int posRef = 0;
			int posAnt = 0;
			int i = 0;
			posRef = externos.indexOf(".");
			while (posRef != -1) {
				// Ponemos la porcion de externos
				resultado += externos.substring(posAnt, posRef);
				// Siguiente porcion de externos
				posAnt = posRef;

				externos = externos.substring(posRef + 1, externos.length() - 1);
				posRef = externos.indexOf(".");

				// Añadimos el refugio
				resultado += listaRef.get(i);
				i++;

				if (posAnt >= posRef)
					posRef = -1;

				System.out.println(resultado);
			}
			// Ultima porcion
			resultado += externos;

		} else {
			// Si hay bomba sólo ponemos los refugios
			for (String refugio : listaRef) {
				resultado += refugio;
			}
		}

		System.out.println("-" + resultado + "-");
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String personas = "abde[fgh]ijk";

		// System.out.println(alphabetWar(personas));

		System.out.println("-" + alphabetWar("ab#de[fgh]ijk") + "-");
		System.out.println("-" + alphabetWar("ab#de[fgh]ij#k") + "-");
		System.out.println("-" + alphabetWar("abde[fgh]ijk") + "-");
		// System.out.println("-" +
		// alphabetWar("ab#de[fgh]ij#k") + "-");
		// System.out.println("-" +
		// alphabetWar("ab#de[fgh]ij#k") + "-");

	}

}
