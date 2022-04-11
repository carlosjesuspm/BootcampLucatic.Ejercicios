package modelo;

import java.util.Date;
import java.util.Objects;

public class Gerente extends Empleado {

    Departamento dep;

    public Gerente() {
    }

    public Gerente(Departamento dep, String nombre, double salario, Date fechaNacimiento) {
        super(nombre, salario, fechaNacimiento);
        this.dep = dep;
    }

    public Departamento getDep() {
        return this.dep;
    }

    public void setDep(Departamento dep) {
        this.dep = dep;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Gerente)) {
            return false;
        }
        Gerente gerente = (Gerente) o;
        return Objects.equals(dep, gerente.dep);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dep);
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                " dep='" + getDep() + "'" +
                "}";
    }

    public void incentivoGerente() {
        double salarioGerenteTotal = getSalario() * 1.05;
        this.setSalario(salarioGerenteTotal);
        System.out.println("El gerente actual percibe un salario de " + this.getSalario() + " euros");
    }
}
