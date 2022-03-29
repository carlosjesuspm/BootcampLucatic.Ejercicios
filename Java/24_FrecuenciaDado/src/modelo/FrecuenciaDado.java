package modelo;

import java.util.Arrays;

import utilidades.AccionesDado;
import utilidades.LecturaDatos;

public class FrecuenciaDado {

	private int[] frecuencia = new int[6];

	public FrecuenciaDado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FrecuenciaDado(int[] frecuencia) {
		super();
		this.frecuencia = frecuencia;
	}

	public int[] getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int[] frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(frecuencia);
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
		FrecuenciaDado other = (FrecuenciaDado) obj;
		return Arrays.equals(frecuencia, other.frecuencia);
	}

	
	
	public void pedirTiradas() {
		int numeroTiradas=LecturaDatos.LeerInt("Indica número de veces que quieres tirar el dado: ");
		tirarDadoVariasVeces(numeroTiradas);
	}
	                                                                                  
	public void tirarDadoVariasVeces(int numeroVeces){
		if (numeroVeces<=frecuencia.length) {
			for (int i=0; i<numeroVeces;i++) {
				int num=AccionesDado.tirarDado();
				frecuencia[i]=num;
			}
		}
	}
	
	public void imprimirFrecuencia(){
		pedirTiradas();
		StringBuilder builder = new StringBuilder();
		String cadena="";
		builder.append("La frecuencia es la siguiente: ");
		for (int i=0; i<frecuencia.length;i++) {
			cadena+=frecuencia[i];
			if (i < (frecuencia.length - 1)) {
				cadena += ",";
			}
		}
		builder.append("[");
		builder.append(cadena);
		builder.append("]");
		System.out.println(builder);
	}
	
}
