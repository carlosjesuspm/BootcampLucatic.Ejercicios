package utilidades;

public class FuncionalidadesArrays {

	public static void crearArray() {

		int fila = LecturaDatos.LeerInt("Introduce n�mero de filas: ");
		int columna = LecturaDatos.LeerInt("Introduce n�mero de columnas: ");

		int[][] array2D = new int[fila][columna];

		rellenarArray(array2D);
		imprimirArrayBidimensional(array2D);

	}

	public static int[][] rellenarArray(int[][] array2D) {

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				array2D[i][j] = LecturaDatos
						.LeerInt("Introduce n�mero Fila " + (i + 1) + " y Columna " + (j + 1) + ": ");
			}
		}
		return array2D;
	}

	public static void imprimirArrayBidimensional(int[][] array2D) {

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}

	}

}
