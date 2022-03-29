package utilidades;

import java.util.Arrays;

public class FuncionalidadesArrays {

	public static void crearArray() {
		
		int limite=LecturaDatos.LeerInt("Introduce número de palabras a introducir: ");
		

		String[]listaPalabras = new String[limite];
		
		rellenarArray(listaPalabras);
		imprimirArray(listaPalabras);
		System.out.println();
		ordenarArrayAlfabeticamente(listaPalabras);
		imprimirArray(listaPalabras);
		
	}
	
	
	public static void rellenarArray(String[]listaPalabras) {
		
		for (int i=0; i<listaPalabras.length;i++) {
			listaPalabras[i]=LecturaDatos.LeerTexto("Introduce palabra " + (i+1) + ": ");
			}
	}
	
	
	public static void imprimirArray(String[]listaPalabras) {
		System.out.print("[ ");
		for (int i=0; i<listaPalabras.length;i++) {
				System.out.print(listaPalabras[i] + " ");;
			}
		System.out.print("]");
	}
	
	public static String[] ordenarArrayAlfabeticamente(String[] listaPalabras) {
		
		for (int i=0; i<listaPalabras.length;i++) {
			for (int j=i+1; j<listaPalabras.length;j++) {
				if (listaPalabras[i].compareTo(listaPalabras[j])>0) {
					
					String temporal=listaPalabras[i];
					listaPalabras[i]=listaPalabras[j];
					listaPalabras[j]=temporal;		
				}
			}
		}
		return listaPalabras;
	}
}
