package modelo;

import java.util.Objects;

import utilidades.FuncionalidadesArrays;
import utilidades.LecturaDatos;

public class Punto {

	private int coordenadaX=0;
	private int coordenadaY=0;
	
	public Punto() {
		super();
	}
	
	public Punto(int coordenadaX, int coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coordenadaX, coordenadaY);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return coordenadaX == other.coordenadaX && coordenadaY == other.coordenadaY;
	}

	@Override
	public String toString() {
		return "("+ "+coordenadaX" + "+coordenadaY+"+ ")";
	}
	
	
	public void crearPunto() {
		this.setCoordenadaX(LecturaDatos.LeerInt("Introduce coordenada x: "));
		this.setCoordenadaY(LecturaDatos.LeerInt("Introduce coordenada y: "));

	}
	
	public void matrizPuntos(){
		FuncionalidadesArrays.crearArray();
	}
	
}
