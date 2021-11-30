package practica1_8;

public class Activity4 {

	public static void main(String[] args) {

		
		Integer integer = 100;
		int entero = 35;
		Integer integer2 = 24;
		Integer integer3 = 24, integer4 = 45;
		String cadena = "5674";

		System.out.println(integer.byteValue());
		// Devuelve el valor del Integer en tipo byte.
		System.out.println(Integer.compare(entero, 9));
		// Compara dos números y devuelve 1 si es mayor el primero, 0 si son el mismo
		// valor y -1 si es mayor el segundo.
		System.out.println(integer3.compareTo(integer4));
		// Compara dos variables de la clase Integer y devuelve lo mismo que en el
		// apartado anterior.
		System.out.println(integer2.doubleValue());
		// Muestra el valor de una variable de la clase Double.
		System.out.println(integer3.equals(integer4));
		// Comprueba si dos variables de la clase Integer son iguales.
		System.out.println(integer3.intValue());
		// Devuelve el correspondiente Integer a tipo int.
		System.out.println(Integer.max(entero, 101));
		// Extrae el máximo valor de dos números.
		System.out.println(Integer.min(entero, 87));
		// Extrae el mínimo valor de dos números.
		System.out.println(Integer.parseInt(cadena));
		// Pasa a enteros, una cadena de enteros.
		System.out.println(Integer.sum(entero, 34));
		// Realiza la suma de dos números enteros.
		System.out.println(Integer.valueOf(56));
		// Devuelve el Integer correspondiente al primitivo.
		System.out.println(Integer.valueOf(integer3));
		// Devuelve el Integer correspondiente al primitivo.
	}

}
