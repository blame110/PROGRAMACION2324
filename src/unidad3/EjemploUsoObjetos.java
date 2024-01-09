package unidad3;

public class EjemploUsoObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Para crear un objeto de tipo persona
		// utilizamos new Persona()
		int edad = 0;
		String nombre = "";

		// Para poder crear un objeto usamos new y el
		// nombre de la clase
		Persona miguel = new Persona();

		Persona mario = new Persona();
		// Cuando utilizamos new se llama al metodo
		// constructor
		// de la clase
		Persona juan = new Persona();

		// Incrementamos la cantidad de personas
		// miguel.numPersonas++;

		miguel.setEdad(34);
		miguel.direccion = "Calle paloma 34";
		// miguel.morirse();

		System.out.println("Numero de personas:" + Persona.numPersonas);

		// Nos cargamos a juan
		juan.morirse();

		System.out.println("Numero de personas de juan:" + juan.numPersonas);

		// Si creamos un objeto de tipo persona
		// utilizando el
		// constructor
		// que recibe los datos, estos se asignan a las
		// variables miembro
		Persona juanma = new Persona("Juanma", 19, 73, false);

		System.out.println("datos de juan: " + juan);

		System.out.println("datos de juanMa: " + juanma);

		// Para acceder a las propiedades del objeto
		// se utiliza el operador "."
		// Solo se pueden acceder a las que ponemos
		// como public
		mario.setNombre("Jose");
		mario.setEdad(18);
		mario.setPeso(79);
		mario.setVivo(true);

		System.out.println("el nombre de mario es " + mario.getNombre());

		// Para crear un objeto se utiliza la palabra
		// reservada new
		Calculadora oper = new Calculadora();

		System.out.println(oper.suma(2, 2));

		System.out.println(oper.dividir(-2, -1));

		System.out.println(Calculadora.dividir(8, 4));

		System.out.println(Calculadora.dividir(5.0f, 0.0f));

		int lista[] = { 3, 4, 2, 7, -56, 1, 23, -4, -134 };

		// double dobleplk = 2 * oper.PLCK;

		System.out.println("El minimo es " + Calculadora.min(lista));

		System.out.println("El area de un circulo de 1 metro es " + oper.areaCirculo(1) + "m");

		Vehiculo coche = new Vehiculo();

		coche.acelerar(34);

		System.out.println("Factorial Iterativo:" + Calculadora.factorial(6));

		System.out.println("Factorial Recursivo:" + Calculadora.factorialR(4));

		System.out.println("El minimo es: " + Calculadora.minR(lista));

		System.out.println("Se ha encontrado el número 13 en la posicion " + Calculadora.buscaNumero(lista, -134));

		System.out.println("Se ha encontrado el número 13 en la posicion " + Calculadora.buscaNumeroR(lista, -134, 0));

		System.out.println("Miguel esta vivo?" + miguel.isVivo());

	}

}
