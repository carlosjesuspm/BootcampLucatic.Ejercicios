package model;

public enum TipoLavado {

    BASICO(3), NORMAL(5), SUPER(7);

    private int tiempoLavado;

    private TipoLavado(int tiempoLavado) {
        this.tiempoLavado = tiempoLavado;
    }

    public int getTiempoLavado() {
        return tiempoLavado;
    }
}
