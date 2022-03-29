package model;

import java.util.Objects;

public class Departamento {

	private String nombre="";
	private String ubicacion="";
	private String telefonoDepartamento="";
	
	
	public Departamento() {
		super();
	}
	
	public Departamento(String nombre, String ubicacion, String telefonoDepartamento) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.telefonoDepartamento = telefonoDepartamento;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getTelefonoDepartamento() {
		return telefonoDepartamento;
	}
	public void setTelefonoDepartamento(String telefonoDepartamento) {
		this.telefonoDepartamento = telefonoDepartamento;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, telefonoDepartamento, ubicacion);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(telefonoDepartamento, other.telefonoDepartamento)
				&& Objects.equals(ubicacion, other.ubicacion);
	}
	
	
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", ubicacion=" + ubicacion + ", telefonoDepartamento="
				+ telefonoDepartamento + "]";
	}
	
	
	
	
}
