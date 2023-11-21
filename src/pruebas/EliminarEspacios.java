package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EliminarEspacios {

	public static void main(String[] args) {

		String s = "  '''  ";
		s = "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e";

		ArrayList<String> palabras = new ArrayList<>();
		s = s.replaceAll("[^a-zA-Z0-9 ']", "");

		List<String> resultado = new ArrayList<String>();

		// Eliminar espacios duplicados
		s = s.trim().replaceAll(" +", " ");

		String[] parts = s.split(" ");
		System.out.println(s);
		palabras.addAll(Arrays.asList(parts));

		Collections.sort(palabras);

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String palabra : palabras) {
			palabra = palabra.toLowerCase();

			if (map.containsKey(palabra) && !palabra.equals("")) {
				map.put(palabra, map.get(palabra) + 1);
			} else {
				map.put(palabra, 1);
			}
		}

		map.remove("'");
		map.remove("");

		TreeMap<String, Integer> sorted = new TreeMap<>();
		sorted.putAll(map);

		System.out.println(sorted.toString());

		if (!s.equals("")) {

			resultado = new ArrayList<String>();
			String max;
			if (sorted.size() > 0) {
				max = Collections.max(sorted.entrySet(), Map.Entry.comparingByValue()).getKey();
				System.out.println("maxima clave " + max);
				if (sorted.get(max) > 0)
					resultado.add(max);
				sorted.remove(max);
			}

			if (sorted.size() > 0) {
				max = Collections.max(sorted.entrySet(), Map.Entry.comparingByValue()).getKey();
				System.out.println("maxima clave " + max);
				if (sorted.get(max) > 0)
					resultado.add(max);

				sorted.remove(max);
			}

			if (sorted.size() > 0) {
				max = Collections.max(sorted.entrySet(), Map.Entry.comparingByValue()).getKey();
				System.out.println("maxima clave " + max);
				if (sorted.get(max) > 0)
					resultado.add(max);
			}
		}

		if (resultado != null)
			System.out.println(resultado.toString());

	}

}
