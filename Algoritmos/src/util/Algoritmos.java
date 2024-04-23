package util;

public abstract class Algoritmos {
	
	/**
	 * Devuelve el sumatorio del numero especificado 
	 * @param numero el numero del que queremos calcular el sumatorio 
	 * @return el sumatorio del numero especificado 
	 */
	
	public static int sumatorio(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("El numero debe ser igual o superior a 0");
		}
		int suma = 0;
		
		for(int i=1;i<=numero;i++) {
			suma += 1;
		}
		
		return suma;
		
	}

}
