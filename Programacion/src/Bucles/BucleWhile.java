package Bucles;

import javax.swing.JOptionPane;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave ="Dani"; 
		
		String pass=""; 
		
		while(clave.equalsIgnoreCase(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contraseña incorrecta"); 
			}

	}
		
		System.out.println("Contraseña correcta. Acceso permitido");

}
}