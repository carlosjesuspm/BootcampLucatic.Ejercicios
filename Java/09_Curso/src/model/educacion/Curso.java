package model.educacion;

import java.util.Arrays;
import java.util.Objects;

import model.personas.Alumno;

public class Curso {

	private String nombreCurso = "";
	private Asignatura[] asignaturas = new Asignatura[2];
	private Alumno[] alumnos = new Alumno[2];
	private int indicarAsignatura = 0;
	private int indicarAlumnos = 0;

	public Curso() {

	}

	public Curso(String nombreCurso) {
		super();
		this.nombreCurso = nombreCurso;
	}

	public Curso(String nombreCurso, Asignatura[] asignaturas, Alumno[] alumnos) {
		super();
		this.nombreCurso = nombreCurso;
		this.asignaturas = asignaturas;
		this.alumnos = alumnos;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public int getIndicarAsignatura() {
		return indicarAsignatura;
	}

	public void setIndicarAsignatura(int indicarAsignatura) {
		this.indicarAsignatura = indicarAsignatura;
	}

	public int getIndicarAlumnos() {
		return indicarAlumnos;
	}

	public void setIndicarAlumnos(int indicarAlumnos) {
		this.indicarAlumnos = indicarAlumnos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(alumnos);
		result = prime * result + Arrays.hashCode(asignaturas);
		result = prime * result + Objects.hash(indicarAlumnos, indicarAsignatura, nombreCurso);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Arrays.equals(alumnos, other.alumnos) && Arrays.equals(asignaturas, other.asignaturas)
				&& indicarAlumnos == other.indicarAlumnos && indicarAsignatura == other.indicarAsignatura
				&& Objects.equals(nombreCurso, other.nombreCurso);
	}

	@Override
	public String toString() {
		return "Curso [nombreCurso=" + nombreCurso + ", asignaturas=" + Arrays.toString(asignaturas) + ", alumnos="
				+ Arrays.toString(alumnos) + ", indicarAsignatura=" + indicarAsignatura + ", indicarAlumnos="
				+ indicarAlumnos + "]";
	}

	public void addAsignatura(Asignatura asign) {
		asignaturas[indicarAsignatura] = asign;
		if (indicarAsignatura < asignaturas.length - 1) {
			indicarAsignatura++;
		}
	}

	public void addAlumno(Alumno alumn) {
		alumnos[indicarAlumnos] = alumn;
		if (indicarAlumnos < alumnos.length - 1) {
			indicarAlumnos++;
		}
	}

	public void mostrarCurso() {
		System.out.println(this.toString());
	}

}
