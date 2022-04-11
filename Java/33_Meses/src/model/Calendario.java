package model;

import java.util.Objects;

public class Calendario {

	private MesesAño mes;
	
	public Calendario(MesesAño mes) {
		super();
		this.mes = mes;
	}

	public Calendario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MesesAño getMes() {
		return mes;
	}

	public void setMes(MesesAño mes) {
		this.mes = mes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendario other = (Calendario) obj;
		return mes == other.mes;
	}

	@Override
	public String toString() {
		return "Calendario [mes=" + mes + "]";
	}

	
}
