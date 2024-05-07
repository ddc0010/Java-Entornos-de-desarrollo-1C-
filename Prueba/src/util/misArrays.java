package util;

import java.util.Arrays;

public abstract class misArrays {
	
	public static float mediaNotas(int [] resultado) {
		int suma = 0;
		for (int nota : resultado) {
			suma += nota;
		}
		return (float) suma/resultado.length;
}

}
