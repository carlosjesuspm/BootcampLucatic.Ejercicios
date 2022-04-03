package datos;

import java.util.ArrayList;
import java.util.List;

import modelo.Empleado;
import modelo.Gerente;
import modelo.Director;
import utilidades.LeerTeclado;

public class DatosEmpresa implements IDatosEmpresa {

    private List<Empleado> listaEmpleados = new ArrayList();

    public DatosEmpresa() {
    }

    public DatosEmpresa(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Empleado> getListaEmpleados() {
        return this.listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    // Mostrar lista empleados
    public void mostrarEmpleados() {
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);
            System.out.println("");
        }
    }

    // Añadir empleado
    public void addEmpleado() {
        Empleado emp = new Empleado();
        emp.crearEmpleado();
        listaEmpleados.add(emp);
    }

    // Seleccionar Empleado
    public int seleccionarEmpleado() {
        String nombreEmpleadoIndicado = LeerTeclado.leerLinea("Introduce nombre empleado: ");

        for (Empleado i : listaEmpleados) {
            if (i.getNombre().equalsIgnoreCase(nombreEmpleadoIndicado)) {
                return 1;
            }
            break;
        }
        return 0;
    }

    // Eliminar empleado
    public void eliminarEmpleado() {
        String nombreEmpleado = LeerTeclado.leerLinea("Introduce nombre del empleado a eliminar: ");

        for (Empleado i : listaEmpleados) {
            if (i.getNombre().equalsIgnoreCase(nombreEmpleado)) {
                listaEmpleados.remove(i);
                System.out.println("Empleado eliminado");
            } else {
                System.out.println("No se ha encontrado empleado a eliminar");
            }
        }

    }

    public void modificarEmpleado() {
        String nombreEmpleado = LeerTeclado.leerLinea("Introduce nombre del empleado a eliminar: ");

        for (Empleado i : listaEmpleados) {
            if (i.getNombre().equalsIgnoreCase(nombreEmpleado)) {
                i.setNombre(LeerTeclado.leerLinea("Introduce nuevo nombre"));
                i.setSalario(LeerTeclado.leerDouble("Introduce nuevo salario"));
                System.out.println("Empleado modificado");
            } else {
                System.out.println("No se ha encontrado empleado a modificar");
            }
        }
    }

    // Incentivar
    public void incentivarDirectorOGerente() {
        for (Empleado e : listaEmpleados) {
            if (e instanceof Director) {
                ((Director) e).incentivoDirector();
                System.out.println("Se ha incentivado al director");
            } else if (e instanceof Gerente) {
                ((Gerente) e).incentivoGerente();
                System.out.println("Se ha incentivado al gerente");
            } else {
                System.out.println("El empleado seleccionado no era ni director, ni gerente");
            }
        }
    }
}
