package practica1_8;

public class Activity6 {

	public static void main(String[] args) {

			String cadena;
			boolean booleano = true;
			int entero = 1 ;
			char character = 'a';
			double decimal = 2.5;
			
			cadena = String.valueOf(booleano) + String.valueOf(character) + String.valueOf(decimal) + String.valueOf(entero);
			System.out.println(cadena);
	}

}
