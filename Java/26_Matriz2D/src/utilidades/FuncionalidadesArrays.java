package utilidades;

import java.util.Arrays;

public class FuncionalidadesArrays {

	public static void crearArray() {
		
		int fila=LecturaDatos.LeerInt("Introduce número de filas: ");
		int columna=LecturaDatos.LeerInt("Introduce número de columnas: ");

		int[][] array2D = new int[fila][columna];
		
		rellenarArray(array2D);
		imprimirArrayBidimensional(array2D);
		
	}
	
	
	
	
	public static int[][] rellenarArray(int[][]array2D) {
		
		for (int i=0; i<array2D.length;i++) {
			for (int j=0;j<array2D[i].length; j++) {
				array2D[i][j]=LecturaDatos.LeerInt("Introduce número Fila " + (i+1) + " y Columna " + (j+1)+": ");
			}
		}
		return array2D;
	}
	
	
	public static void imprimirArrayBidimensional(int[][]array2D) {
		
		for (int i=0; i<array2D.length;i++) {
			for (int j=0;j<array2D[i].length; j++) {
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
