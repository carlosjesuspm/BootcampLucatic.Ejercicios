package model;

import utilities.LecturaDatos;

public class OperacionesTriangulo {

	public static void ladoMasLargo(double lado1, double lado2, double lado3) {
		if (lado1 > lado2) {
            if (lado1 > lado3) {
                System.out.println("El mayor es: " + lado1);                                             
            } else {
                System.out.println("el mayor es: " + lado3);     
            }
        } else if (lado2 > lado3) {
            System.out.println("El mayor es: " + lado2);
        } else {
            System.out.println("El mayor es: " + lado3);
        }
	}
	
	public static void ladoMasLargoConAtributosTeclado() {
		
		double lado1=LecturaDatos.LeerInt("Introduce primer lado: ");
		double lado2=LecturaDatos.LeerInt("Introduce segundo lado: ");
		double lado3=LecturaDatos.LeerInt("Introduce tercer lado: ");
		
		if (lado1 > lado2) {
            if (lado1 > lado3) {
                System.out.println("El mayor es: " + lado1);                                             
            } else {
                System.out.println("El mayor es: " + lado3);     
            }
        } else if (lado2 > lado3) {
            System.out.println("El mayor es: " + lado2);
        } else {
            System.out.println("el mayor es: " + lado3);
        }


	}
}
