package modelo;

import java.util.Date;
import java.util.Objects;

import utilidades.LeerTeclado;

public class Empleado {

    private String nombre;
    private double salario;
    private Date fechaNacimiento;

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre, double salario, Date fechaNacimiento) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre) && salario == empleado.salario
                && Objects.equals(fechaNacimiento, empleado.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, salario, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", salario='" + getSalario() + "'" +
                ", fechaNacimiento='" + getFechaNacimiento() + "'" +
                "}";
    }

    public void crearEmpleado() {
        this.nombre = LeerTeclado.leerLinea("Introduce nombre del nuevo empleado: ");
        this.salario = LeerTeclado.leerDouble("Introduzca el salario:");
        this.fechaNacimiento = new Date();
    }
}
