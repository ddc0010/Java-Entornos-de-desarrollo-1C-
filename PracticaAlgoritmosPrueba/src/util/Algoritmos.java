package util;

public abstract class Algoritmos {
	
	//METODO DE FACTORIAL 
	
	public static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }
	
	 public static int fibonacci(int num) {
	        if (num <= 1)
	            return num;
	        else
	            return fibonacci(num - 1) + fibonacci(num - 2);
	    }
	 
	 public static boolean esPrimo(int num) {
	        if (num <= 1)
	            return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0)
	                return true;
	        }
	        return false;

}
}
