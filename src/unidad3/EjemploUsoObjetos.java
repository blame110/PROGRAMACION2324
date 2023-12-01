package unidad3;

public class EjemploUsoObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Para crear un objeto de tipo persona
		// utilizamos new Persona()
		Persona mario = new Persona();

		// Para acceder a las propiedades del objeto
		// se utiliza el operador "."
		// Solo se pueden acceder a las que ponemos como public
		mario.nombre = "Mario";
		mario.edad = 18;
		mario.peso = 78;
		mario.vivo = true;

		Calculadora oper = new Calculadora();

		System.out.println(oper.suma(2, 2));

		System.out.println(oper.dividir(-2, -1));

		System.out.println(Calculadora.dividir(8, 4));

		System.out.println(Calculadora.dividir(5.0f, 0.0f));

		int lista[] = { 3, 4, 2, 7, -56, 1, 23, -4, 34 };

		System.out.println("El minimo es " + Calculadora.min(lista));
		
		System.out.println("El area de un circulo de 1 metro es " + oper.areaCirculo(1) + "m");

	}

}
