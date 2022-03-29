package control;

import model.Departamento;
import model.Director;
import model.Empleado;

public class Main {

	public static void main(String[] args) {

		Departamento dep1 = new Departamento ("Tecnico","calle Barceloneta", "6205581");
		Empleado emp1=new Empleado ("Pedro", "Marquez", "calle Madriles", "5621475P", "@pedromarquez", "T2154", 2500, dep1);
		Director d1=new Director ("Sergio", "Rodriguez", "calle Climon", "878449491L", "@sergiorodriguez", "D152", 4500, dep1,"Director");
		
		/*Director d1 = (Director)emp1;
		 * No podemos castear un empleado a director porque estamos pasando de un paquete más grande (empleado)
		 * a otro más chico (Director).
		 */
		
		System.out.println(dep1);
		System.out.println(emp1);
		System.out.println(d1);

	}

}
