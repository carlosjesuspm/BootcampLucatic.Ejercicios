package utilities;

public class DefinicionEdad {

	public static int pedirEdad() {
		int edad=LecturaDatos.LeerInt("Introduce numero: ");
		while (edad<=0) {
			System.out.println("Edad incorrecta");
			edad=LecturaDatos.LeerInt("Introduce numero: ");
		}
		return edad;
	}
	
	public static void mensajeSegunEdad() {
		
		int edad=pedirEdad();
		
		if ((edad>0)&&(edad<=4)){
			System.out.println("Pequeñin");
		}
		else if ((edad>4)&&(edad<=20)){
			System.out.println("Niño");
		}
		else if ((edad>10)&&(edad<=40)){
			System.out.println("Adolescente");
		}
		else{
			System.out.println("Talludito");
		}

		
	}
	
}
