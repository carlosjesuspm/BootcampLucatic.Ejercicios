package model.educacion;

import java.util.Objects;

import model.personas.Alumno;

public class Nota {

	private double notaAlumno=0;
	private Alumno alumno = new Alumno();
	
	public Nota() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Nota(Alumno alumno,double notaAlumno) {
		super();
		this.notaAlumno = notaAlumno;
		this.alumno = alumno;
	}
	
	public double getNotaAlumno() {
		return notaAlumno;
	}
	public void setNotaAlumno(double notaAlumno) {
		this.notaAlumno = notaAlumno;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(alumno, notaAlumno);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return Objects.equals(alumno, other.alumno)
				&& Double.doubleToLongBits(notaAlumno) == Double.doubleToLongBits(other.notaAlumno);
	}
	
	@Override
	public String toString() {
		return "Nota [notaAlumno=" + notaAlumno + ", alumno=" + alumno + "]";
	}
	
	
}
