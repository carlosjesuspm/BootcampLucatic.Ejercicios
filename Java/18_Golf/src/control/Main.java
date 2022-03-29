package control;

import model.Cliente;
import model.DescuentosClub;

/*
 * El club de golf “El agujerito” quiere un programa para las cuotas de los socios.
- Cuota inicial de 500 euros
- Mayores de 65 años: descuento 50%
- Mujeres: Descuento 15%
- Menores de 18 años: descuento 25% (si el padre no es socio) o 35% (si el padre es socio)
Si un usuario puede acceder a más de un descuento, sólo cogerá el mayor descuento.
NOTA: Definir como constantes los porcentajes que se pueden descontar.
 * */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("Pedro", 65, false, false);
		Cliente c2 = new Cliente("Manuela", 75, true, false);


		Cliente c3 = new Cliente ("Carlos", 17, false, true);
		Cliente c4 = new Cliente ("Raul", 16, false, false);
		Cliente c5 = new Cliente ("Claudia", 15, true, true);
		Cliente c6 = new Cliente ("Silvia", 14, true, false);
		Cliente c7 = new Cliente ("Julia", 52, true, false);
		Cliente c8 = new Cliente ("Julia", 52, true, true);


		
		
		DescuentosClub.calcularCuotaCliente(c1);
		DescuentosClub.calcularCuotaCliente(c2);
		DescuentosClub.calcularCuotaCliente(c3);
		DescuentosClub.calcularCuotaCliente(c4);
		DescuentosClub.calcularCuotaCliente(c5);
		DescuentosClub.calcularCuotaCliente(c6);
		DescuentosClub.calcularCuotaCliente(c7);
		DescuentosClub.calcularCuotaCliente(c8);





	}

}
