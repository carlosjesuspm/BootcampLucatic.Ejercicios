package servicios;

import datos.DatosEmpresa;
import datos.IDatosEmpresa;

public class ServiciosEmpresa implements IServiciosEmpresa {

    private IDatosEmpresa datos = new DatosEmpresa();

    public void mostrarEmpleados() {
        datos.mostrarEmpleados();
    }

    public void addEmpleado() {
        datos.addEmpleado();
    }

    public void addDirector() {
        datos.addDirector();
    }

    public void addGerente() {
        datos.addGerente();
    }

    public void seleccionarEmpleado() {
        datos.seleccionarEmpleado();
    }

    public void modificarEmpleado() {
        datos.modificarEmpleado();
    }

    public void eliminarEmpleado() {
        datos.eliminarEmpleado();
    }

    public void incentivarDirectorOGerente() {
        datos.incentivarDirectorOGerente();
    }
}
