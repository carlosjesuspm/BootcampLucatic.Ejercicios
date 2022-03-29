package utilidades;

import java.util.Arrays;

public class FuncionalidadesArrays {
	
	//a) Imprimir un array (separando los elementos por comas)

	public static void imprimirArray(int[] numeros) {
		StringBuilder builder = new StringBuilder();
		String cadena="";
		builder.append("[");
		for (int i=0; i<numeros.length;i++) {
			cadena+=numeros[i];
			if (i < (numeros.length - 1)) {
				cadena += ",";
			}
		}
		builder.append(cadena);
		builder.append("]");
		System.out.println(builder);
		
	}
	
	//b) Crear Arrays de un tamaño proporcionado (pidiendo datos)
	
	public static int[] crearArray(int cantidad) {
		System.out.println("Rellenando array de " + cantidad);
		int[] valores = new int[cantidad];
		// Relleno array
		return (crearArray(valores));
	}
	
	public static int[] crearArray(int[]array) {
		
		int limiteArray=array.length;
		for (int i=0; i<limiteArray;i++) {
			array[i]=LecturaDatos.LeerInt();
		}
		return array;
	}
	
	
	
}
