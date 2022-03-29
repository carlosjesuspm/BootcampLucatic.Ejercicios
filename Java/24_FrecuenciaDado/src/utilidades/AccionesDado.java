package utilidades;

import java.util.Random;

public class AccionesDado {

	public static int generarNumeroAleatorio(int min, int max) {
		Random random = new Random();
		int value = random.nextInt(min+max)+min;
		return value;
	}
	
	public static int tirarDado() {
		return generarNumeroAleatorio(1,6);
	}                                    
	
}
                           