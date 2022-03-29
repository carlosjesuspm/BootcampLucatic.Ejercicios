/*Escribir una clase para trabajar con arrays (de tipo int) que incluya métodos estáticos para:
a) Imprimir un array (separando los elementos por comas)
b) Crear Arrays de un tamaño proporcionado (pidiendo datos)
c) Indicar la suma de todos los números
d) Devolver el array invertido*/

package control;

import utilities.FuncionalidadesArrays;

public class Main {

	public static void main(String[] args) {
		int[] valores = {1,4,6,8,1899};
		FuncionalidadesArrays.imprimirArray(valores);
		FuncionalidadesArrays.crearArray(valores);
		FuncionalidadesArrays.sumaValoresSArray(valores);
		FuncionalidadesArrays.arrayInvertido(valores);
		FuncionalidadesArrays.ordenar(valores);

		



	}
	
	
	

}
