package model;

import java.util.Objects;

public class ElementoTablaPeriodica {

	
	private String nombre="";
	private String simbolo ="";
	private int numeroElemento=0;
	private static int numeroInstancias;
	
	
	public ElementoTablaPeriodica() {
		super();
		numeroInstancias++;
	}
	
	


	public ElementoTablaPeriodica(String nombre, String simbolo, int numeroElemento) {
		super();
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.numeroElemento = numeroElemento;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	public int getNumeroElemento() {
		return numeroElemento;
	}
	public void setNumeroElemento(int numeroElemento) {
		this.numeroElemento = numeroElemento;
	}

	public static int getNumeroInstancias() {
		return numeroInstancias;
	}

	public static void setNumeroInstancias(int numeroInstancias) {
		ElementoTablaPeriodica.numeroInstancias = numeroInstancias;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, numeroElemento, simbolo);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementoTablaPeriodica other = (ElementoTablaPeriodica) obj;
		return Objects.equals(nombre, other.nombre) && numeroElemento == other.numeroElemento
				&& Objects.equals(simbolo, other.simbolo);
	}
	
	
	@Override
	public String toString() {
		return "ElementoTablaPeriodica [nombre=" + nombre + ", simbolo=" + simbolo + ", numeroElemento="
				+ numeroElemento + "]";
	}

	public static void numeroInstanciasElemento() {
		System.out.println("El numero de instancias es: "+ ElementoTablaPeriodica.getNumeroInstancias());
	}
	
	
	
}
