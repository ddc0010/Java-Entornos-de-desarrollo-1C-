package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import models.Persona;


public class TestEdad {
	
	@Test
    void testPersonaedad0() {
		Persona p = new Persona("nombre", "apellidos", 0);
		String esperado = "Menor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
    }
	
	@Test
	void testPersonaEdad17() {
		Persona p = new Persona ("nombre", "apellidos", 17);
		String esperado = "Menor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testPersonaEdad18() {
		Persona p = new Persona ("nombre", "apellidos", 18);
		String esperado = "Mayor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	@Test
	void testPersonaEdad64() {
		Persona p = new Persona ("nombre", "apellidos", 64);
		String esperado = "Mayor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	@Test
	void testPersonaEdad65() {
		Persona p = new Persona ("nombre", "apellidos", 65);
		String esperado = "Mayor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	@Test
	void testPersonaEdad131() {
		Persona p = new Persona ("nombre", "apellidos", 131);
		String esperado = "No existe";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	@Test 
	void testPersonaEdadInvalidaMenos1 () {
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> new Persona("nombre", "apellidos", -1));
		
		String esperado = "La edad debe estar entre 0 y 130";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
	@Test 
	void testPersonaEdadInvalida130 () {
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> new Persona("nombre", "apellidos", 130));
		
		String esperado = "La edad debe estar entre 0 y 130";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
	@Test 
	void testPersonaEdadInvalida131 () {
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> new Persona("nombre", "apellidos", 131));
		
		String esperado = "La edad debe estar entre 0 y 130";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	

    
            
    }

