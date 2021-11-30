package practica1_8;

public class Activity3 {

	public static void main(String[] args) {
		char primitive = 'c';
		Character character = 'c';

		System.out.println(character.charValue());
		//devuelve la variable correspondiente al character
		System.out.println(Character.compare(primitive, primitive));
		//compara los dos caracteres numericamente
		System.out.println(Character.isDigit(primitive));
		//comprueba si el caracter es un digito
		System.out.println(Character.isLetter(primitive));
		//comprueba si el caracter es una letra
		System.out.println(Character.isLowerCase(primitive));
		//comprueba si el caracter esta en minusculas
		System.out.println(Character.isUpperCase(primitive));
		//comprueba si el caracter esta en mayusculas
		System.out.println(Character.isSpaceChar(primitive));
		//comprueba si el caracter es un interlineado
		System.out.println(Character.toLowerCase(primitive));
		//convierte el caracter a minusculas
		System.out.println(Character.toUpperCase(primitive));
		//convierte el caracter a mayusculas
		System.out.println(Character.valueOf(primitive));
		//devuelve el valor del caracter
	}

}
