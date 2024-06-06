package unidad3.examen;

public class PruebasExamen {

	public static void main(String[] args) {

		Persona mario1 = new Persona();

		Persona monica = new Persona(1, "Monica", 19, 500, true);
		Persona mario = new Persona(2, "Mario", 45, 3500, true);
		Persona fran = new Persona(3, "Fran", 2, 200, false);

		Persona listaPersonas[] = new Persona[3];

		listaPersonas[0] = monica;
		listaPersonas[1] = mario;
		listaPersonas[2] = fran;

		Familia losPiscineros = new Familia("id1", "Los Pisci", "calle la piscina", false, false, 10, listaPersonas);

		System.out.println("La longitud del array es " + listaPersonas.length);

		Persona listaPersonas2[] = { monica, mario, fran };

		// System.out.println(monica);

		System.out.println("La familia tiene " + losPiscineros.numPersonas() + " miembros");

		System.out.println(losPiscineros.numPersonasIngresos(200) + " cobran menos de 600 euros");

		losPiscineros.asignarRolProgenitor("fran", true);

		System.out.println(losPiscineros);

	}

}
