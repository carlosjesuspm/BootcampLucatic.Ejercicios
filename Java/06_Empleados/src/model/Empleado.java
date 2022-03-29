package model;

import java.util.Objects;

public class Empleado extends Persona {

	private String codigoEmpleado="";
	private double sueldoEmpleado=0;
	private Departamento departamentoEmpleado;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empleado(String nombre, String apellido, String direccion, String dni, String email, String codigoEmpleado, double sueldoEmpleado, Departamento dep) {
		super(nombre, apellido, direccion, dni, email);
		this.codigoEmpleado = codigoEmpleado;
		this.sueldoEmpleado = sueldoEmpleado;
		this.departamentoEmpleado=dep;
		
	}
	
	
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public double getSueldoEmpleado() {
		return sueldoEmpleado;
	}
	public void setSueldoEmpleado(double sueldoEmpleado) {
		this.sueldoEmpleado = sueldoEmpleado;
	}
	public Departamento getDepartamentoEmpleado() {
		return departamentoEmpleado;
	}
	public void setDepartamentoEmpleado(Departamento departamentoEmpleado) {
		this.departamentoEmpleado = departamentoEmpleado;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(codigoEmpleado, departamentoEmpleado, sueldoEmpleado);
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
		Empleado other = (Empleado) obj;
		return Objects.equals(codigoEmpleado, other.codigoEmpleado)
				&& Objects.equals(departamentoEmpleado, other.departamentoEmpleado)
				&& Double.doubleToLongBits(sueldoEmpleado) == Double.doubleToLongBits(other.sueldoEmpleado);
	}
	
	
	@Override
	public String toString() {
		return "Empleado [codigoEmpleado=" + codigoEmpleado + ", sueldoEmpleado=" + sueldoEmpleado
				+ ", departamentoEmpleado=" + departamentoEmpleado + "]";
	}
	
	
	
	
}
