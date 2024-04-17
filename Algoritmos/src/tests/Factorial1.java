package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import util.Factorial;


public class Factorial1 {
	
	@Test
	void factorial() {
		int factorialEsperada = 24;
		int factorialObtenida = Factorial.factorial(4);
		assertEquals(factorialEsperada, factorialObtenida);
		
		
	}

}
