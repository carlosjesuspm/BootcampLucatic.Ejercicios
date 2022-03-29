package utilities;

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
	
	public static int[] crearArray(int[]array) {
		
		int limiteArray=array.length;
		
		for (int i=0; i<limiteArray;i++) {
			array[i]=LecturaDatos.LeerInt("Introduce " + i + " numero:");
		}
		return array;
	}
	
	public static int sumaValoresSArray(int[]array) {
		int suma=0;
		for (int i=0;i<array.length;i++) {
			suma+=i;
		}
		return suma;
	}
	
	public static String arrayInvertido (int[]array){
		StringBuilder arrayInvertido = new StringBuilder(Arrays.toString(array));
		return arrayInvertido.reverse().toString();
	}
	
	public static int[] ordenar(int[]array) {
		Arrays.sort(array);
		return array;
	}
}
