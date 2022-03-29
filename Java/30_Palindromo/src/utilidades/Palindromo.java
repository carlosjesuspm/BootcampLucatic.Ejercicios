package utilidades;

public class Palindromo {

	
	public static void pedirMensaje() {
		
		System.out.println("Escribe mensaje debajo:");
		String cadenaDada = LecturaDatos.LeerTexto("");
		System.out.println();
		palabraPalindroma(cadenaDada);
			
	}
	
	public static void palabraPalindroma(String palabra) {
		
		String cadenaPalindroma="";
		for (int i=palabra.length()-1; i>=0; i--) {
			cadenaPalindroma+=palabra.charAt(i);
			
		}
		
		if (palabra.equals(cadenaPalindroma)) {
			System.out.println("La cadena es palíndroma: " + palabra + " / " + cadenaPalindroma);
		}
		else {
			System.out.println("Esta palabra no cumple con las características");
		}
	}
	
}
