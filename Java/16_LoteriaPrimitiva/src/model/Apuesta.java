package model;

import java.util.Arrays;

public class Apuesta {

	private String[] apuesta = new String[6];

	public Apuesta() {
	}

	public Apuesta(String[] apuesta) {
		super();
		this.apuesta = apuesta;
	}

	public String[] getApuesta() {
		return apuesta;
	}

	public void setApuesta(String[] apuesta) {
		this.apuesta = apuesta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(apuesta);
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
		Apuesta other = (Apuesta) obj;
		return Arrays.equals(apuesta, other.apuesta);
	}

	@Override
	public String toString() {
		return "Apuesta [apuesta=" + Arrays.toString(apuesta) + "]";
	}
	
	
}
