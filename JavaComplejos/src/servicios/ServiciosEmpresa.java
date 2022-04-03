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

    public void seleccionarEmpleado() {
        datos.seleccionarEmpleado();
    }

    public void modificarEmpleado() {
    }

    public void eliminarEmpleado() {
    }

    public void incentivarDirectorOGerente() {
    }

    public void incentivarGerente() {
    }
}
