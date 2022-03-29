package utilities;

public class OperacionesNumeros {

	public static int pedirNumero() {
		int numero=LecturaDatos.LeerInt("Introduce numero: ");
		while (numero<=0) {
			System.out.println("Numero incorrecta. Debe ser entero positivo");
			numero=LecturaDatos.LeerInt("Introduce numero: ");
		}
		return numero;
	}
	
	public static void calcularFactorial() {
		int numeroFactorial = pedirNumero();
		int iFactorial=1;
		for (int i=2; i<=numeroFactorial;i++) {
			iFactorial=iFactorial *i;
		}
		System.out.println(numeroFactorial+"! --> " + iFactorial );
		
	}
}
