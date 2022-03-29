package utilidades;

public class MetodosCadena {

	
	public static int longitudCadena(String cadena) {
		if ((cadena==null)||(cadena=="")) {
			return 0;
		}
		else {
			return cadena.length();
		}
	}
	
	
	
	public static void tamanyoCadena(String[]cadena) {
		
		for (String i:cadena) {
			int tamanyoCelda=longitudCadena(i);
			System.out.println(tamanyoCelda);
		}
	}
	
	public static void imprimirArray(String[]cadena) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Array de valores [");
		String numeroLetrasPalabra="";
		for (String i:cadena) {
			numeroLetrasPalabra+=longitudCadena(i)+",";
		}
		
		builder.append(numeroLetrasPalabra);
		builder.append("]");
		System.out.println(builder);
		
	}
	
}
