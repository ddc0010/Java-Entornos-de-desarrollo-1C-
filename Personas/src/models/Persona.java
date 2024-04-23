package models;

/**
 * @throws IllegalArgumentException
 */

public class Persona {
	String nombre; 
	String apellidos; 
	int edad;
	
	/**
	 * Constructor de persona. Crea un objeto que representa a una persona 
	 * 
	 * @param nombre El nombre de la persona 
	 * @param apellidos Los apellidos de la persona 
	 * @param edad La edad de la persona. Debe estar entre 0 y 130
	 * @throws IllegalArgumentException
	 */
	
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		if (edad < 0 || edad > 130) {
			throw new IllegalArgumentException("La edad debe estar entre 0 y 130");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Devuelve si la persona es menor de edad, mayor de edad o jubilada. 
	 */
	
	public String mostrarEdad() {
		String frase="";
		if (edad < 18) {
			System.out.println("Menor de edad");
		} else if (edad <= 65) {
			System.out.println("Mayor de edad");
		} else {
			System.out.println("Jubilado"); 
		}
		return frase; 
		}
			
		
	}
	

