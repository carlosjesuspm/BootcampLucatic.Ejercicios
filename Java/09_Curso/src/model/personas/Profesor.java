package model.personas;

import java.util.Objects;

public class Profesor extends Persona {

	double sueldoBruto=0;

	public Profesor() {
		
	}

	public Profesor(String nombre, String apellido, String direccion, String dni, String email, double sueldo) {
		super(nombre, apellido, direccion, dni, email);
		this.sueldoBruto = sueldo;
		// TODO Auto-generated constructor stub
	}

	

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(sueldoBruto);
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
		Profesor other = (Profesor) obj;
		return Double.doubleToLongBits(sueldoBruto) == Double.doubleToLongBits(other.sueldoBruto);
	}

	@Override
	public String toString() {
		return super.toString()+"Profesor [sueldoBruto=" + sueldoBruto + "]";
	}
	
}
