package practica1_8;

public class Activity1 {

	public static void main(String[] args) {

		float a = 1;
		int b = 1;
		int x = 2;
		double c = 1;
		
		System.out.println(Math.abs(a));
		//da el valor absoluto de un valor float
		System.out.println(Math.addExact(b, x));
		//suma los dos valores int
		System.out.println(Math.ceil(c));
		//devuelve el valor mas cercano al menos infinito del valor introducido
		System.out.println(Math.decrementExact(b));
		//devuelve el valor introducido menos uno
		System.out.println(Math.floor(c));
		//devuelve el valor mas cercano al mas infinito del valor introducido
		System.out.println(Math.incrementExact(b));
		//devuelve el valor introducido mas uno
		System.out.println(Math.max(a, b));
		//devuelve el valor mas grande de los dos introducidos
		System.out.println(Math.multiplyExact(b, x));
		//multiplica los dos valores
		System.out.println(Math.negateExact(b));
		//devuelve el valor introducido en negativo
		
		
	}

}
