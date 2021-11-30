package practica1_8;

public class Activity2 {

	public static void main(String[] args) {

		String test1 = " Hola y ", test2= "Que tal ", test3 = "Adios ", substring = "Buenos dias";
	
		
		System.out.println(test1.charAt(1));
		//saca la letra de la string que le pedimos por orden numerico
		System.out.println(test1.length());
		//muestra el numero de caracteres que tiene el string
		System.out.println(test1.codePointAt(3));
		//devuelve el caracter en codigo Unicode de la string que pedimos por orden numerico
		System.out.println(test1.compareTo(test2));
		//compara los dos strings por su codigo de unicode
		System.out.println(test1.compareToIgnoreCase(test2));
		//compara los dos strings por su codigo de unicode sin tener en cuenta las mayusculas o minusculas
		System.out.println(test1.concat(test2));
		//une dos strings
		System.out.println(test1.endsWith(test3));
		//comprueba si la cadena indicada acaba con otra cadena indicada
		System.out.println(test1.equals(test2));
		//comprueba si las cadenas son iguales
		System.out.println(test1.equals(test2) && test2.equals(test3));
		//comprueba si las 3 cadenas son iguales
		System.out.println(test1.equalsIgnoreCase(test2));
		//comprueba si las cadenas son iguales sin tener en cuenta las mayusculas o minusculas
		System.out.println(test1.indexOf("a"));
		//busca en que posicion esta la letra indicada
		System.out.println(test1.indexOf("y", 2));
		//busca en que posicion esta la letra indicada desde una posicion que pedimos
		System.out.println(test1.indexOf(substring));
		//indica donde comienza una subcadena de la cadena elegida
		System.out.println(test1.indexOf(substring, 0));
		//indica donde comienza una subcadena de la cadena elegida desde un punto concreto
		System.out.println(test1.isEmpty());
		//indica si la cadena esta vacia o no
		System.out.println(test1.lastIndexOf("o"));
		//da la ultima posicion del character elegido
		System.out.println(test1.lastIndexOf("H", 1));
		//da la ultima posicion del character elegido desde un punto concreto
		System.out.println(test1.lastIndexOf(substring));
		//da la ultima posicion del substring desde una cadena
		System.out.println(test1.lastIndexOf(substring, 2));
		//da la ultima posicion del substring desde una cadena desde un punto contreto
		System.out.println(test1.replace("a", "i"));
		//cambia el caracter de una cadena por otro indicado
		System.out.println(test1.toUpperCase());
		//cambia los caracteres de la cadena por caracteres en mayusculas
		System.out.println(test1.trim());
		//quita los espacios del principio que contiene la cadena 
		
		
	}

}
