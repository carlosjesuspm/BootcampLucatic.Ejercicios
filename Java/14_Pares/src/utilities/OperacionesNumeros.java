package utilities;

public class OperacionesNumeros {

	
	public static int pedirNumero() {
		int numero=LecturaDatos.LeerInt("Introduce numero: ");
		return numero;
	}
	
	
	public static void sumarTopeNumerosPares() {
		
		int numero=pedirNumero();
		int suma=0;
		
		for (int i=2; i<=numero;i=i+2) {
			suma+=i;
		}
		System.out.println("La suma total es: " + suma);
	}
	
	public static void sumarCantidadNumerosPares() {
		int numero=pedirNumero();
		int suma=0;
		
		for (int i=1; i<=numero;i++) {
			suma+=i*2;
			
		}
		System.out.println("La suma total es: "+ suma);
	}
}

