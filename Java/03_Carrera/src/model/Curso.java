package model;

import java.util.Arrays;
import java.util.Objects;

import utilities.LecturaDatos;

public class Curso {

	private String nombreCurso="";
	private Asignatura[] Asignaturas = new Asignatura[2];
	private int indAsign = 0;
	
	
	
	public String getNombreCurso() {
		return nombreCurso;
	}



	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}



	public Asignatura[] getAsignaturas() {
		return Asignaturas;
	}



	public void setAsignaturas(Asignatura[] asignaturas) {
		Asignaturas = asignaturas;
	}



	public int getIndAsign() {
		return indAsign;
	}



	public void setIndAsign(int indAsign) {
		this.indAsign = indAsign;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(Asignaturas);
		result = prime * result + Objects.hash(indAsign, nombreCurso);
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
		return Arrays.equals(Asignaturas, other.Asignaturas) && indAsign == other.indAsign
				&& Objects.equals(nombreCurso, other.nombreCurso);
	}

	@Override
	public String toString() {
		return "Curso [nombreCurso=" + nombreCurso + ", Asignaturas=" + Arrays.toString(Asignaturas) + ", indAsign="
				+ indAsign + "]";
	}
	

	public void crearCurso() {
		this.setNombreCurso(LecturaDatos.LeerTexto("Introduce nombre curso: "));
		
	}
	public void addAsignatura(Asignatura asign){
		Asignaturas[indAsign] = asign;
		if (indAsign < Asignaturas.length-1){
			indAsign++;
		}
	}
	
	
	
	
	
	
	
	
}
