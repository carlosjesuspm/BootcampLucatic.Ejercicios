package control;


import model.educacion.Asignatura;
import model.educacion.Curso;
import model.educacion.Examen;
import model.educacion.Nota;
import model.personas.Alumno;
import model.personas.Persona;
import model.personas.Profesor;

public class Main {

	public static void main(String[] args) {
		

		//Creacion personas 
		
		Persona a1 = new Alumno("Carlos", "Pérez", "Sevilla", "52468415L", "@carlosperez", "curso1");
		Persona a2 = new Alumno("Silvia", "Soriano", "Sevilla", "516111P", "@silviasoriano", "curso1");
		Persona p1 = new Profesor("Victor", "Pérez", "Sevilla", "165165451L", "@victorperez", 3000);
		Persona p2 = new Profesor("Miriam", "Ruiz", "Sevilla", "1651541G", "@miriamruiz", 4000);

		// Creacion curso
		
		Curso curso1 = new Curso("Curso Java");
		
		// Crear Asignaturas
		Asignatura asig1 = new Asignatura("Programacion orientada a objetos", (Profesor)p1);
		Asignatura asig2 = new Asignatura("BBDD", (Profesor)p2);
		
		
	
		//Añadir al curso las asignaturas y alumnos
		
		curso1.addAsignatura(asig1);
		curso1.addAsignatura(asig2);
		curso1.addAlumno((Alumno)a1);
		curso1.addAlumno((Alumno)a2);
		
		//Crear examen
		Examen examenCurso = new Examen(asig1);
		 
		 //Crear notas
		Nota[] notas= new Nota[2];
		notas[0] = new Nota((Alumno)a1,6);
		notas[1] = new Nota((Alumno)a2,7);
		examenCurso.setNotas(notas);
		 
		curso1.mostrarCurso();
	}


}
