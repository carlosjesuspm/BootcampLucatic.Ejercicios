package model;

import java.util.Objects;

import utilities.LecturaDatos;

public class Asignatura {

	private String nombre="";
	private String codigoAsignatura="";
	
	public Asignatura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asignatura(String nombre, String codigoAsignatura) {
		super();
		this.nombre = nombre;
		this.codigoAsignatura = codigoAsignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoAsignatura() {
		return codigoAsignatura;
	}

	public void setCodigoAsignatura(String codigoAsignatura) {
		this.codigoAsignatura = codigoAsignatura;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(codigoAsignatura, nombre);
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
		return Objects.equals(codigoAsignatura, other.codigoAsignatura) && Objects.equals(nombre, other.nombre);
	}
	
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", codigoAsignatura=" + codigoAsignatura + "]";
	}
	
	public void crearAsignatura() {
		this.setNombre(LecturaDatos.LeerTexto("Introduce nombre asignatura: "));
		this.setCodigoAsignatura(LecturaDatos.LeerTexto("Introduce código asignatura: "));
	}
	
}
