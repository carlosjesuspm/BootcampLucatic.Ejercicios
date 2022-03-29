package model;

import java.util.Objects;

public class Mensaje {

	private String texto="";

	public Mensaje() {
	}

	public Mensaje(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(texto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		return Objects.equals(texto, other.texto);
	}

	@Override
	public String toString() {
		return "Mensaje [texto=" + texto + "]";
	}
	
}
