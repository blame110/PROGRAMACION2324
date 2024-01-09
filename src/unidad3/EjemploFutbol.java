package unidad3;

public class EjemploFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos una nueva liga que genera todos los
		// datos
		LigaFutbol ligaBbva = new LigaFutbol();

		System.out.println(ligaBbva);

		ligaBbva.mostrarClasificacion(0);

		System.out.println(ligaBbva.pichichi());

	}

}
