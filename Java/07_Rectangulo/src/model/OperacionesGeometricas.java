package model;

import utilities.LecturaDatos;

public class OperacionesGeometricas {

	public static void areaTriangulo() {
		
		double lado1=LecturaDatos.LeerInt("Introduce primer lado: ");
		double lado2=LecturaDatos.LeerInt("Introduce segundo lado: ");
		while ((lado1==lado2)||(lado1<=0)||(lado2<=0)) {
			System.out.println("Al ser un rectángulo, los lados no pueden medir lo mismo. Introduce de nuevo los datos");
			lado2=LecturaDatos.LeerInt("Introduce segundo lado: ");
		}
		double resultado = lado1*lado2;
		System.out.println("El area del triangulo es: " + resultado);
	}
}
