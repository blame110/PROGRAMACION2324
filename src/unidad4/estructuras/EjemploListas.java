package unidad4.estructuras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import unidad4.model.ClienteDO;

public class EjemploListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definicion de array basico de java
		int listNumeros[] = new int[10];
		// Definimos un array estandar
		String listaNombres3[] = { "pablo", "sergio", "Alex" };

		// Definicion de un arraylist de numeros
		List<Integer> listaNumeros = new ArrayList<Integer>();

		List<String> listaNombres = new ArrayList<String>();
		List<String> listaNombres2 = new ArrayList<String>();

		List<Character> listaCaracteres;

		// Creamos una lista de clientes
		List<ClienteDO> listaClientes = new ArrayList<ClienteDO>();

		// Creamos una lista de clientes
		List<ClienteDO> listaClientes2 = new ArrayList<ClienteDO>();

		ClienteDO cliente1 = new ClienteDO(1, "jorge", "Perlitas56", 119, ' ', null, "toitoto");
		ClienteDO cliente2 = new ClienteDO(2, "LuisMi", "Toscano", 19, 'M', "em@gmail.com", "toitoto");
		ClienteDO cliente3 = new ClienteDO(3, "Juanmanuel", "Toscano", 13, 'M', "em@gmail.com", "toitoto");
		ClienteDO cliente4 = new ClienteDO(4, "Fran", "Perlitatotal", 119, ' ', null, "toitoto");
		ClienteDO cliente5 = new ClienteDO(5, "Ruben", "Hacker", 19, 'M', "em@gmail.com", "toitoto");

		// Añadimos elementos utilizando add
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);

		// Podemos usar un indice para indicar la
		// posicion donde insertarlo
		listaClientes.add(1, cliente3);

		listaClientes2.add(cliente4);
		listaClientes2.add(cliente5);

		// Podemos añadir multiples elementos de otra
		// lista de tipo compatible con addAll
		listaClientes2.addAll(0, listaClientes);

		// Para sacar un elemento de la lista
		// utilizamos get
		System.out.println("El cliente en la posicion 2 es " + listaClientes.get(1));

		System.out.println(listaClientes2);

		String nombre = "juanjo4";

		listaNombres.add("juanjo");
		listaNombres.add("juanjo2");
		listaNombres.add("juanjo3");
		listaNombres.add("pepe");
		listaNombres.add(nombre);
		listaNombres.add("juanjo");
		listaNombres.add("juanjo2");
		listaNombres.add("juanjo3");
		listaNombres.add("pepe");
		listaNombres.add(nombre);

		listaNombres2.add(nombre);
		listaNombres2.add("juanjo3");
		listaNombres2.add("pepe");

		listaNombres2 = listaNombres.subList(3, 9);

		System.out.println("La lista2 contiene " + listaNombres2);

		// Para buscar hay dos funciones
		// principalemente indexof y contains
		System.out.println("Juanjo esta en la lista? " + listaNombres.contains("juanjo2"));

		// Indexof nos busca entre los elementos y nos
		// devuelve el indice (posicion) donde se
		// encuentra
		int posicionJuanjo2 = listaNombres.indexOf("juanjo2");

		System.out.println("En la posicion " + posicionJuanjo2 + " esta " + listaNombres.get(posicionJuanjo2));

		// Para borrar un element utilizamos la funcion
		// remove
		listaNombres.remove(1);

		System.out.println("Juanjo esta en la lista? " + listaNombres.contains("juanjo2"));

		// Clear borra todos los elementos de la lista
		// listaNombres.clear();

		// Borra todos los elementos de la lista
		// excepto los de la lista metida como
		// parametro
		listaNombres2.retainAll(listaNombres);

		System.out.println("Lista1 despues del retainall " + listaNombres);

		// Cantidad de elementos de una lista se saca
		// con size
		System.out.println("La lista 1 tiene " + listaNombres.size() + " Elementos ");

		// CONVERSIONES

		// De array a lista
		List<String> listaNombres4 = Arrays.asList(listaNombres3);

		System.out.println(listaNombres4);

		// Conversión de lista o collection a array
		// simple
		String listaNombres5[] = (String[]) listaNombres4.toArray();

	}

}
