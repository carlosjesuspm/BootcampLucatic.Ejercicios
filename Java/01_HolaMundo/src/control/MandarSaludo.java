package control;

import model.Mensaje;
import utilities.LecturaDatos;

public class MandarSaludo {
	

	public void saludo(String nombre) {
		
		Mensaje mensaje = new Mensaje();
		mensaje.setTexto(LecturaDatos.LeerTexto("Muy buenas "+nombre));
		System.out.println(mensaje);
		
	}
	
}
