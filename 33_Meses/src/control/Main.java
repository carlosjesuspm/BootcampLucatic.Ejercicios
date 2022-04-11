package control;

import model.Calendario;
import model.MesesAño;

public class Main {

	public static void main(String[] args) {
		
		Calendario cal = new Calendario (MesesAño.ABRIL);
		System.out.println(cal);

	}

}
