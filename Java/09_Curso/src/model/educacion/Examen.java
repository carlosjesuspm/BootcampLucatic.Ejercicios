package model.educacion;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Examen {

	private String textoExamen="";
	private Date fechaExamen;
	private Asignatura asignatura;
	private Nota[] notas= new Nota[2];
	private int indicarNota=0;
	
	public Examen() {}


	public Examen(Asignatura asignatura) {
		this.asignatura = asignatura;

	}
	public Examen(String textoExamen, Date fechaExamen, Asignatura asignatura, Nota[] notas) {
		super();
		this.textoExamen = textoExamen;
		this.fechaExamen = fechaExamen;
		this.asignatura = asignatura;
		this.notas = notas;
		
	}



	public String getTextoExamen() {
		return textoExamen;
	}



	public void setTextoExamen(String textoExamen) {
		this.textoExamen = textoExamen;
	}



	public Date getFechaExamen() {
		return fechaExamen;
	}



	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}



	public Asignatura getAsignatura() {
		return asignatura;
	}



	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}



	public Nota[] getNotas() {
		return notas;
	}



	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + Objects.hash(asignatura, fechaExamen, textoExamen);
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
		Examen other = (Examen) obj;
		return Objects.equals(asignatura, other.asignatura) && Objects.equals(fechaExamen, other.fechaExamen)
				&& Arrays.equals(notas, other.notas)&& Objects.equals(textoExamen, other.textoExamen);
	}

	
	@Override
	public String toString() {
		return "Examen [textoExamen=" + textoExamen + ", fechaExamen=" + fechaExamen + ", asignatura=" + asignatura
				+ ", notas=" + Arrays.toString(notas) + "]";
	}


	public void addNotaExamen(Nota nota){
		notas[indicarNota] = nota;
		if (indicarNota < notas.length-1){
			indicarNota++;
		}
	}	
	
	
	
}
