package model;

import java.util.Objects;

public class TunelLavado {

    private int precio;
    private TipoLavado tipoLavado;

    public TunelLavado() {
    }

    public TunelLavado(int precio, TipoLavado tipoLavado) {
        this.precio = precio;
        this.tipoLavado = tipoLavado;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public TipoLavado getTipoLavado() {
        return this.tipoLavado;
    }

    public void setTipoLavado(TipoLavado tipoLavado) {
        this.tipoLavado = tipoLavado;
    }

    public TunelLavado precio(int precio) {
        setPrecio(precio);
        return this;
    }

    public TunelLavado tipoLavado(TipoLavado tipoLavado) {
        setTipoLavado(tipoLavado);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TunelLavado)) {
            return false;
        }
        TunelLavado tunelLavado = (TunelLavado) o;
        return precio == tunelLavado.precio && Objects.equals(tipoLavado, tunelLavado.tipoLavado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio, tipoLavado);
    }

    @Override
    public String toString() {
        return "{" +
                " precio='" + getPrecio() + "'" +
                ", tipoLavado='" + getTipoLavado() + "'" +
                "}";
    }

}
