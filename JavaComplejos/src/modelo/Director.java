package modelo;

import java.util.Date;
import java.util.Objects;

public class Director extends Empleado {

    Coche cocheEmpresa;

    public Director() {
    }

    public Director(Coche cocheEmpresa, String nombre, double salario, Date fechaNacimiento) {
        super(nombre, salario, fechaNacimiento);
        this.cocheEmpresa = cocheEmpresa;
    }

    public Coche getCocheEmpresa() {
        return this.cocheEmpresa;
    }

    public void setCocheEmpresa(Coche cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Director)) {
            return false;
        }
        Director director = (Director) o;
        return Objects.equals(cocheEmpresa, director.cocheEmpresa);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cocheEmpresa);
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                " cocheEmpresa='" + getCocheEmpresa() + "'" +
                "}";
    }

    public void incentivoDirector() {
        double salarioDirectorTotal = (getSalario() * 1.10) + 100;
        this.setSalario(salarioDirectorTotal);
        System.out.println("El Director actual percibe un salario de " + this.getSalario() + "euros");
    }

}
