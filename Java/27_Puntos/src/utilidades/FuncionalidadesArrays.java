package utilidades;

import java.util.Arrays;

public class FuncionalidadesArrays {

	public static void crearArray() {
		
		int fila=LecturaDatos.LeerInt("Introduce número de filas: ");
		int columna=LecturaDatos.LeerInt("Introduce número de columnas: ");

		String[][] array2D = new String[fila][columna];
		
		rellenarArrayPuntos(array2D);
		System.out.println("");
		imprimirArrayBidimensional(array2D);
		System.out.println("");
		girarArray90Grados(array2D);
		
	}
	
	
	public static String[][] rellenarArrayPuntos(String[][]array2D) {
		
		for (int i=0; i<array2D.length;i++) {
			for (int j=0;j<array2D[i].length; j++) {
				array2D[i][j]=LecturaDatos.LeerTexto("Introduce número Fila " + (i+1) + " y Columna " + (j+1)+": ");
			}
		}
		return array2D;
		
	}
	
	
	public static void imprimirArrayBidimensional(String[][]array2D) {
		
		for (int i=0; i<array2D.length;i++) {
			for (int j=0;j<array2D[i].length; j++) {
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void girarArray90Grados(String[][] array2D) {
		
		int fil = array2D.length;
		int col = array2D[0].length;
		String[][] matNueva = new String[fil][col];
		
		for (int i=0; i<fil;i++) {
			for (int j =0; j<col;j++) {
				matNueva[i][j]=array2D[fil-j-1][i];
				System.out.print(matNueva[i][j]+" ");
			}
			System.out.println();
		}
	}

}
