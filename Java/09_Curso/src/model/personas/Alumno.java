package model.personas;

import java.util.Objects;

public class Alumno extends Persona {

	private String cursoAlumno="";

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido, String direccion, String dni, String email, String cursoAlumno) {
		super(nombre, apellido, direccion, dni, email);
		this.cursoAlumno = cursoAlumno;
		// TODO Auto-generated constructor stub
	}


	public String getCursoAlumno() {
		return cursoAlumno;
	}

	public void setCursoAlumno(String cursoAlumno) {
		this.cursoAlumno = cursoAlumno;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cursoAlumno);
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(cursoAlumno, other.cursoAlumno);
	}
	

	@Override
	public String toString() {
		return super.toString()+"Alumno [cursoAlumno=" + cursoAlumno + "]";
	}
	
}
