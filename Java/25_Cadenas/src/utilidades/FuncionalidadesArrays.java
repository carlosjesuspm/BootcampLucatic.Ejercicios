package utilidades;




public class FuncionalidadesArrays {

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
	
	public static String[] rellenarArray(String[] listaCadena) {

		int limiteArray = listaCadena.length;
		for (int i = 0; i < limiteArray; i++) {
			listaCadena[i] = LecturaDatos.LeerTexto("Introduce texto " + (i+1)+ ": ");
		}
		return listaCadena;
	}

	
	public static String[] rellenarArray2(int limiteArray) {
		
		String[] listaCadena = new String[limiteArray];
		return (rellenarArray(listaCadena));
	}
	
	
	
	
	
}
