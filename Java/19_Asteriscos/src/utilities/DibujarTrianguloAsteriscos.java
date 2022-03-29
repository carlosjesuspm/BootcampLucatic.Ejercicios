package utilities;

public class DibujarTrianguloAsteriscos {

	public static int pedirNumero() {
		int numero=LecturaDatos.LeerInt("Introduce numero: ");
		while (numero<=0) {
			System.out.println("Numero incorrecta. Debe ser entero positivo");
			numero=LecturaDatos.LeerInt("Introduce numero: ");
		}
		return numero;
	}
	
	public static void TrianguloLadoDerecho() {
		int numeroAsteriscos=pedirNumero();
		for (int fila = 1; fila <= numeroAsteriscos; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
	}
	
	
	public static void TrianguloLadoIzquierdo() {
		int numeroAsteriscos=pedirNumero();
		for (int fila=1; fila<=numeroAsteriscos;fila++) {
			for (int columna = 1; columna <= numeroAsteriscos-fila; columna++) {
                System.out.print("  ");
            }
			for (int columna = 1; columna <= fila; columna++)
            System.out.println("* ");
		}
		System.out.println("");
	}
	
	public static void TrianguloCompleto() {
		int numeroAsteriscos=pedirNumero();
		for (int fila=1; fila<=numeroAsteriscos;fila++) {
			for (int columna = 1; columna <= numeroAsteriscos-fila; columna++) {
                System.out.print("  ");
            }            
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("* * ");
            }
            System.out.println("");
        }
	}
}

