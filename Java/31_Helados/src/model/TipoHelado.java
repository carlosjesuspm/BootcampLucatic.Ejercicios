package model;

public enum TipoHelado {
    MINI(2), SUPER(3), MEGA(5);

    private final int bolas;

    private TipoHelado(int bolas) {
        this.bolas = bolas;
    }

    public int getBolas() {
        return bolas;
    }
}
