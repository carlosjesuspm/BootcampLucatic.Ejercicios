package modelo;

import java.util.Objects;

public class Departamento {

    String nombreDepartamento;
    int numeroTelefonoDepartamento;

    public Departamento() {
    }

    public Departamento(String nombreDepartamento, int numeroTelefonoDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        this.numeroTelefonoDepartamento = numeroTelefonoDepartamento;
    }

    public String getNombreDepartamento() {
        return this.nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getNumeroTelefonoDepartamento() {
        return this.numeroTelefonoDepartamento;
    }

    public void setNumeroTelefonoDepartamento(int numeroTelefonoDepartamento) {
        this.numeroTelefonoDepartamento = numeroTelefonoDepartamento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Departamento)) {
            return false;
        }
        Departamento departamento = (Departamento) o;
        return Objects.equals(nombreDepartamento, departamento.nombreDepartamento)
                && numeroTelefonoDepartamento == departamento.numeroTelefonoDepartamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreDepartamento, numeroTelefonoDepartamento);
    }

    @Override
    public String toString() {
        return "{" +
                " nombreDepartamento='" + getNombreDepartamento() + "'" +
                ", numeroTelefonoDepartamento='" + getNumeroTelefonoDepartamento() + "'" +
                "}";
    }

}
