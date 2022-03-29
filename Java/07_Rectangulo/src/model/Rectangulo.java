package model;

import java.util.Objects;

public class Rectangulo {

	private double ladoLargo=0;
	private double ladoAncho=0;
	
	
	public Rectangulo() {
	}
	
	
	public Rectangulo(double ladoLargo, double ladoAncho) {
		super();
		this.ladoLargo = ladoLargo;
		this.ladoAncho = ladoAncho;
	}
	
	
	public double getLadoLargo() {
		return ladoLargo;
	}
	public void setLadoLargo(double ladoLargo) {
		this.ladoLargo = ladoLargo;
	}
	public double getLadoAncho() {
		return ladoAncho;
	}
	public void setLadoAncho(double ladoAncho) {
		this.ladoAncho = ladoAncho;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ladoAncho, ladoLargo);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		return Double.doubleToLongBits(ladoAncho) == Double.doubleToLongBits(other.ladoAncho)
				&& Double.doubleToLongBits(ladoLargo) == Double.doubleToLongBits(other.ladoLargo);
	}
	
	
	@Override
	public String toString() {
		return "Rectangulo [ladoLargo=" + ladoLargo + ", ladoAncho=" + ladoAncho + "]";
	}
	
}
