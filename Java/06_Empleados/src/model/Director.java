package model;

import java.util.Objects;

public class Director extends Empleado{

	private String categoria="Director";
	
	public Director() {
		super();
	}
	
	public Director(String nombre, String apellido, String direccion, String dni, String email, String codigoEmpleado,
			double sueldoEmpleado, Departamento dep, String categoria) {
		super(nombre, apellido, direccion, dni, email, codigoEmpleado, sueldoEmpleado, dep);
		this.categoria = categoria;
		// TODO Auto-generated constructor stub
	}

	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(categoria);
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
		Director other = (Director) obj;
		return Objects.equals(categoria, other.categoria);
	}
	@Override
	public String toString() {
		return "Director [categoria=" + categoria +"]";
	}

	
	
	
	
}
