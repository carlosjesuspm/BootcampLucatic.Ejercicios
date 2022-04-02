package model.educacion;

import java.util.Objects;

import model.personas.Profesor;

public class Asignatura {

	private String nombreAsignatura = "";
	private Profesor profesor = new Profesor();

	public Asignatura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asignatura(String nombreAsignatura, Profesor profesor) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.profesor = profesor;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreAsignatura, profesor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return Objects.equals(nombreAsignatura, other.nombreAsignatura)
				&& Objects.equals(profesor, other.profesor);
	}

	@Override
	public String toString() {
		return "Asignatura [nombreAsignatura=" + nombreAsignatura + ", profesor=" + profesor + "]";
	}

}
