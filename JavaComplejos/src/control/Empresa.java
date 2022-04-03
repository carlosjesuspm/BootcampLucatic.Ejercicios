package control;

import gui.Menu;
import servicios.IServiciosEmpresa;
import servicios.ServiciosEmpresa;
import utilidades.LeerTeclado;

public class Empresa {

    IServiciosEmpresa servicios = new ServiciosEmpresa();

    public int elegirOpcion() {

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
        }
        return opcion;
    }

    public void interfazConsola() {

        do {
            Menu.mostrarMenu();
            elegirOpcion();
        } while (elegirOpcion() == 6);
    }
}
