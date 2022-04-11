package model;

import java.util.Objects;

public class Helado {

    private String nombreHelado;
    private TipoHelado tipo;

    public Helado() {
    }

    public Helado(String nombreHelado, TipoHelado tipo) {
        this.nombreHelado = nombreHelado;
        this.tipo = tipo;
    }

    public String getNombreHelado() {
        return this.nombreHelado;
    }

    public void setNombreHelado(String nombreHelado) {
        this.nombreHelado = nombreHelado;
    }

    public TipoHelado getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoHelado tipo) {
        this.tipo = tipo;
    }

    public Helado nombreHelado(String nombreHelado) {
        setNombreHelado(nombreHelado);
        return this;
    }

    public Helado tipo(TipoHelado tipo) {
        setTipo(tipo);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Helado)) {
            return false;
        }
        Helado helado = (Helado) o;
        return Objects.equals(nombreHelado, helado.nombreHelado) && Objects.equals(tipo, helado.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreHelado, tipo);
    }

    @Override
    public String toString() {
        return "{" +
                " nombreHelado='" + getNombreHelado() + "'" +
                ", tipo='" + getTipo() + "'" +
                "}";
    }

}
