package model;

import java.util.Objects;

public class Cliente {

	private String nombreCliente;
	private int edadCliente;
	private boolean generoCliente; //True mujeres y false hombres
	private boolean padreSocio;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Cliente(String nombreCliente, int edadCliente, boolean generoCliente, boolean padreSocio) {
		super();
		this.nombreCliente = nombreCliente;
		this.edadCliente = edadCliente;
		this.generoCliente = generoCliente;
		this.padreSocio = padreSocio;
	}
	
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public int getEdadCliente() {
		return edadCliente;
	}
	public void setEdadCliente(int edadCliente) {
		this.edadCliente = edadCliente;
	}
	public boolean isGeneroCliente() {
		return generoCliente;
	}
	public void setGeneroCliente(boolean generoCliente) {
		this.generoCliente = generoCliente;
	}
	public boolean isPadreSocio() {
		return padreSocio;
	}
	public void setPadreSocio(boolean padreSocio) {
		this.padreSocio = padreSocio;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(edadCliente, generoCliente, nombreCliente, padreSocio);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return edadCliente == other.edadCliente && generoCliente == other.generoCliente
				&& Objects.equals(nombreCliente, other.nombreCliente) && padreSocio == other.padreSocio;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [nombreCliente=" + nombreCliente + ", edadCliente=" + edadCliente + ", generoCliente="
				+ generoCliente + ", padreSocio=" + padreSocio + "]";
	}
	
	
	
	
	
	
}
