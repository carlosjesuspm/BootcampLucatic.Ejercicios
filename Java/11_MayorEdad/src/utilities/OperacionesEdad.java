package utilities;

public class OperacionesEdad {

	private static final int MAYORIA_EDAD=18;
	
	
	public static void indicarMayoriaEdad(int edad) {
		
		while (edad<=0) {
			System.out.println("No existen edades negativas");
			edad=LecturaDatos.LeerInt("Introduce la edad nuevamente: ");
		}
		
		if (edad<MAYORIA_EDAD) {
			System.out.println("Aún eres menor de edad");
		}
		else {
			System.out.println("Efectivamente. Eres mayor de edad");
		}
	}
}
