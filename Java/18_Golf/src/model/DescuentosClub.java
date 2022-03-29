package model;

public class DescuentosClub {

	private static final int CUOTA_INICIAL_CLUB=500;
	private static final double DESCUENTO_MAYORES_65=0.5;
	private static final double DESCUENTO_MUJERES=0.85;
	private static final double MENORES_18_PADRE_NO_SOCIO=0.75;
	private static final double MENORES_18_PADRE_SOCIO=0.65;

	public static void calcularCuotaCliente(Cliente cliente) {
		
		int edadCliente = cliente.getEdadCliente();
		
		if (edadCliente>64){
			System.out.println("La cuota de este cliente asciende a: " +(CUOTA_INICIAL_CLUB* DESCUENTO_MAYORES_65));
		}
		else if ((edadCliente<18)&(cliente.isPadreSocio())) {
			System.out.println("La cuota de este cliente asciende a: " +(CUOTA_INICIAL_CLUB* MENORES_18_PADRE_SOCIO));
		}
		else if(edadCliente<18) {
			System.out.println("La cuota de este cliente asciende a: " +(CUOTA_INICIAL_CLUB* MENORES_18_PADRE_NO_SOCIO));
		}
		else if (cliente.isGeneroCliente()) {
			System.out.println("La cuota de este cliente asciende a: " +(CUOTA_INICIAL_CLUB*DESCUENTO_MUJERES));
		}
	}
}
 