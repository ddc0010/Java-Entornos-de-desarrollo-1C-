package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import util.Algoritmos;

class testsAlgoritmos {
	
	@Test
	void testFibonacci() {
       int fibonacciEspera = 3;
       int fibonacciObtiene = Algoritmos.fibonacci(5);
       assertEquals(fibonacciEspera, fibonacciObtiene);
    }
    
	@Test
	void testFactorial() {
	       int factorialEspera = 4;
	       int factorialObtiene = Algoritmos.factorial(29);
	       assertEquals(factorialEspera, factorialObtiene);
    }
	
	@Test
	void testesPrimo() {
	       int numero = 7;
	       boolean primoEspera = true;
	       boolean PrimoObtiene = Algoritmos.esPrimo(numero);
	       assertEquals(primoEspera, PrimoObtiene);
    }
    

	}