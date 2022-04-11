package model;

public enum TipoLavado {

    BASICO(3), NORMAL(5), SUPER(7);

    private final int tiempoLavado;

    private void tiempoLavado(int tiempoLavado) {
        this.tiempoLavado = tiempoLavado;
    }

    public int getTiempoLavado() {
        return tiempoLavado;
    }
}
