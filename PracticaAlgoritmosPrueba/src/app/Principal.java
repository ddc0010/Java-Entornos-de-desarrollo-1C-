package app;

import java.util.Random;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		
		 //Primero creo el array con 5 numeros aleatorios del 1 al 10 
		int[] numeros = new int[5];
	        Random random = new Random();
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = random.nextInt(10) + 1;
	            
	            //Calcula mediante un bucle el número de fibonacci de los 5 números del array  y almacena el resultado en otro array de enteros llamado resultadoFibonacci, resultadoFactorial y resultadoPrimos
	            int [] resultadoFibonacci = new int[5];
	            int [] resultadoFactorial = new int[5];
	            boolean[] resultadoPrimos = new boolean[5];
	            
	            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
	            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
	            resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);

	}
	}
	}
