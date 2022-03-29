package utilities;

public class Random {

	public static int generadorNumerosRandom(int init, int fin) {
		
		// Retorna un número aleatorio entre min (incluido) y max (excluido)
		return init + (int) Math.round(Math.random() * (init - fin)); 
		
		
	}
}
