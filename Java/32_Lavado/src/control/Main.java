package control;

import model.TipoLavado;
import model.TunelLavado;

public class Main {
    public static void main(String[] args) throws Exception {

    	TunelLavado lavado = new TunelLavado(5, TipoLavado.NORMAL);
    	System.out.println(lavado);
    }
}
