package control;

import model.Helado;

import model.TipoHelado;

public class Main {
    public static void main(String[] args) throws Exception {

        Helado helado = new Helado("MaxiBoom", TipoHelado.MINI);
        System.out.println(helado);
    }
}
