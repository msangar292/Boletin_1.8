package practica1_8;

public class Activity5 {

	public static void main(String[] args) {

		Double double1 = 32.7;
		Double double2 = 27.9, double3 = 41.2;
		Double double4 = 3.4;

		System.out.println(Double.compare(34.5, 61.7));
		// Compara los decimales y devuelve 1 si el primero es mayor que el segundo, 0
		// si son iguales y -1 si el segundo es mayor que el primero.
		System.out.println(double3.compareTo(double3));
		// Compara variables decimales de la clase Double y hace lo mismo que el
		// apartado anterior.
		System.out.println(double3.doubleValue());
		// Devuelve el primitivo que tiene el Wrapper.
		System.out.println(double3.equals(double3));
		// Comprueba si los dos valores son iguales.
		System.out.println(double4.floatValue());
		// Devuelve el valor de tipo float que tiene una variable double.
		System.out.println(double1.intValue());
		// Devuelve el valor de tipo int que tiene una variable double.
		System.out.println(double3.isInfinite());
		// Comprueba si la variable tiene un valor infinito.
		System.out.println(Double.isInfinite(34.5));
		// Comprueba si un valor de tipo double es infinito.
		System.out.println(double3.isNaN());
		// Comprueba si una variable de la clase Double no es un número.
		System.out.println(Double.isInfinite(-1));
		// Comprueba si el valor es infinito.
		System.out.println(Double.max(23.4, 21.7));
		// Muestra el máximo de dos valores.
		System.out.println(Double.min(45.3, 45.4));
		// Muestra el mínimo de dos valores.
		System.out.println(Double.parseDouble("567"));
		// Convierte una cadena numérica en variable decimal.
		System.out.println(Double.sum(34.0, 21.9));
		// Muestra el resultado de la suma entre dos valores.
		System.out.println(Double.valueOf(double2));
		// Muestra el valor de un Wrapper Double.
		System.out.println(Double.valueOf("321.56"));
		// Muestra el valor decimal de una cadena numérica.
		
	}

}
