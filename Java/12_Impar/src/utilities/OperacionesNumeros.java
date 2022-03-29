package utilities;

public class OperacionesNumeros {
	
	public static double pedirNumero() {
		
		int numero=(LecturaDatos.LeerInt("Introduce numero: "));
		return numero;
	}
	
	public static void numeroParOImpar() {
		
		double numero = pedirNumero();
		
		if (numero%2==0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El numero es impar");
		}
	}

}
