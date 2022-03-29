package utilities;

public class OperacionesGeometricas {

	
	public static void distanciaDosPuntos(int coordenada1, int coordenada2, int coordenada3, int coordenada4) {
		
		double distanciaX = (coordenada3-coordenada1)*(coordenada3-coordenada1);
		double distanciaY= (coordenada4-coordenada2)*(coordenada4-coordenada2);
		double resultado = Math.sqrt((distanciaX+distanciaY));
		System.out.println("La distancia entre dos puntos es: " + resultado);
	}
	
	public static void distanciaPuntoOrigen(int coordenada1, int coordenada2) {
		double distanciaX = (coordenada1-0)*(coordenada1-0);
		double distanciaY = (coordenada2-0)*(coordenada2-0);
		double resultado = Math.sqrt((distanciaX+distanciaY));
		System.out.println("La distancia entre dos puntos y el origen es: " + resultado);
	}
}
