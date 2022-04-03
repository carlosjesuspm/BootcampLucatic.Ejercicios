package control;

import gui.Menu;
import servicios.IServiciosEmpresa;
import servicios.ServiciosEmpresa;
import utilidades.LeerTeclado;

public class Empresa {

    IServiciosEmpresa servicios = new ServiciosEmpresa();

    public void interfazConsola() {

        boolean seguir = true;
        do {
            Menu.mostrarMenu();
            seguir = elegirOpcion();
        } while (seguir);
    }

    public boolean elegirOpcion() {

        boolean continuar = true;
        int opcion = LeerTeclado.leerInt("Introduce opción a realizar: ");
        switch (opcion) {

            case 1:
                servicios.mostrarEmpleados();
                break;

            case 2:
                servicios.addEmpleado();
                break;

            case 3:
                servicios.modificarEmpleado();
                break;

            case 4:
                servicios.eliminarEmpleado();
                break;

            case 5:
                servicios.incentivarDirectorOGerente();
                break;

            case 6:
                continuar = salir();
        }
        return continuar;
    }

    private boolean salir() {
        String sino = LeerTeclado.leerLinea("¿Está seguro?(S/N)");
        return (sino.toUpperCase().charAt(0) != 'S');
    }

}
