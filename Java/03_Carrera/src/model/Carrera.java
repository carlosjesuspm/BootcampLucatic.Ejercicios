package model;

import java.util.Arrays;
import java.util.Objects;

import utilities.LecturaDatos;

public class Carrera {

	private String nombreCarrera;
	private String codigoCarrera; 
	private Curso[] cursos = new Curso[2];
	private int numeroCurso = 0;
	
	public Carrera() {
		super();
	}
	
	public Carrera(String nombreCarrera, String codigoCarrera, Curso[] cursos, int numeroCurso) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.codigoCarrera = codigoCarrera;
		this.cursos = cursos;
		this.numeroCurso = numeroCurso;
	}
	
	
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public String getCodigoCarrera() {
		return codigoCarrera;
	}
	public void setCodigoCarrera(String codigoCarrera) {
		this.codigoCarrera = codigoCarrera;
	}
	public Curso[] getCursos() {
		return cursos;
	}
	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}
	public int getNumeroCurso() {
		return numeroCurso;
	}
	public void setNumeroCurso(int numeroCurso) {
		this.numeroCurso = numeroCurso;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cursos);
		result = prime * result + Objects.hash(codigoCarrera, nombreCarrera, numeroCurso);
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
		Carrera other = (Carrera) obj;
		return Objects.equals(codigoCarrera, other.codigoCarrera) && Arrays.equals(cursos, other.cursos)
				&& Objects.equals(nombreCarrera, other.nombreCarrera) && numeroCurso == other.numeroCurso;
	}
	
	
	@Override
	public String toString() {
		return "Carrera [nombreCarrera=" + nombreCarrera + ", codigoCarrera=" + codigoCarrera + ", cursos="
				+ Arrays.toString(cursos) + ", numeroCurso=" + numeroCurso + "]";
	}
	
	public void addCurso(Curso curs) {
		
		cursos[numeroCurso]=curs;
		if(numeroCurso<cursos.length-1) {
			numeroCurso++;
		}
	}
	
	
	public void crearCarrera() {
		this.setNombreCarrera(LecturaDatos.LeerTexto("Introduce nombre carrera: "));
		this.setCodigoCarrera(LecturaDatos.LeerTexto("Introduce código carrera: "));
		
	}
	
	public void mostrarCarrera() {
		System.out.println(this.toString());
	}
	
	
	
}
