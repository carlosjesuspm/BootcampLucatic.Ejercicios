package control;

import model.Asignatura;
import model.Carrera;
import model.Curso;

public class Main {


	public static void main(String[] args) {
		Carrera carrera = new Carrera();
		Curso curso1=new Curso();
		Curso curso2=new Curso();
		Asignatura asignatura1= new Asignatura();
		Asignatura asignatura2= new Asignatura();
		Asignatura asignatura3= new Asignatura();
		Asignatura asignatura4= new Asignatura();
		carrera.crearCarrera();
		curso1.crearCurso();
		carrera.addCurso(curso1);
		asignatura1.crearAsignatura();
		curso1.addAsignatura(asignatura1);
		asignatura2.crearAsignatura();
		curso1.addAsignatura(asignatura2);
		curso2.crearCurso();
		carrera.addCurso(curso2);
		asignatura3.crearAsignatura();
		curso2.addAsignatura(asignatura3);
		asignatura4.crearAsignatura();
		curso2.addAsignatura(asignatura4);
		
		carrera.mostrarCarrera();
		
	}
}
