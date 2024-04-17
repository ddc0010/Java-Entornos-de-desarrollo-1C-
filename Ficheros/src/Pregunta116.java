
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pregunta116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String filePath = "‪C://Users//MEDAC//Desktop//Practica116.txt"; // Ruta al archivo de texto
WTS RG SP1. dm if interested.
        try {
            String[] opciones = encontrarLineaMasLarga(filePath);
            
            // Muestra la línea más larga según las opciones especificadas
            int i = 0;
            while (i < opciones.length) {
                System.out.println(opciones[i]);
                i++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    // Encuentra la línea más larga en el archivo y maneja las tres opciones
    private static String[] encontrarLineaMasLarga(String filePath) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(filePath));
        String linea;
        String lineaMasLarga = "";
        int longitudMaxima = 0;
        boolean encontrado = false;
        
        while ((linea = lector.readLine()) != null) {
            int longitud = linea.length();
            if (longitud > longitudMaxima) {
                longitudMaxima = longitud;
                lineaMasLarga = linea;
                encontrado = true;
            } else if (longitud == longitudMaxima && !encontrado) {
                lineaMasLarga = linea;
                encontrado = true;
            }
        }
        
        lector.close();
        
        
      
        if (lineaMasLarga.isEmpty()) {
            return new String[]{"No hay líneas en el archivo."};
        } else if (!encontrado) {
            return new String[]{"a) Línea más larga:\n" + lineaMasLarga};
        } else {
            String todasLasLineasMasLargas = "c) Todas las líneas más largas:\n" + obtenerTodasLineasMasLargas(filePath, longitudMaxima);
            String ultimaLineaMasLarga = "b) Línea más larga (última):\n" + lineaMasLarga + "\n" + todasLasLineasMasLargas;
            return new String[]{"a) Línea más larga:\n" + lineaMasLarga, ultimaLineaMasLarga, todasLasLineasMasLargas};
        }
    }
    
   
    private static String obtenerTodasLineasMasLargas(String filePath, int longitudMaxima) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(filePath));
        String lineasMasLargas = "";
        String linea;
        
        while ((linea = lector.readLine()) != null) {
            if (linea.length() == longitudMaxima) {
                lineasMasLargas += linea + "\n";
            }
        }
        
        lector.close();
        
        return lineasMasLargas;
    }


	}

