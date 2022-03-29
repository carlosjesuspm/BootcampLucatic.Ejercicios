package utilidades;

public class MetodosParaReemplazar {

	
	public static void pedirMensaje() {
		
		System.out.println("Escribe mensaje debajo:");
		String cadenaDada = LecturaDatos.LeerTexto("");
		String palabraABuscar="endeluego";
		System.out.println();
		reemplazarPalabras(palabraABuscar, cadenaDada);
			
	}
	
	public static void reemplazarPalabras(String palabraABuscar,String cadenaDada) {
		String[] mensaje = palabraABuscar.split("\\W+");
		for (String palabra : mensaje) {
			if (cadenaDada.contains(palabra)) {
				System.out.println("La palabra contiene endeluego y es sustituido por desde luego:");
				System.out.println();
				String cadenaNueva=cadenaDada.replace("endeluego", "desde luego");
				System.out.println(cadenaNueva);
			}
			else {
				System.out.println("El texto no contiene la palabra buscada");
			}
		}
		
	}
}
