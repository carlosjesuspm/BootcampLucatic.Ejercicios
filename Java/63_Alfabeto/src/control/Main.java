package control;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Diseñar un programa que escriba en un fichero de texto el alfabeto
		
		File file = new File ("alfabeto.txt");  // Puede darse que el texto origine una excepcion null que se debe recoger. Para este caso, no hará falta, ya que el texto lo introducimos nosotros. 
		FileWriter fw = null;                   // Para anexar, solo hemos de poner true al final de la sentencia File: File file = new File ("alfabeto.txt", true);
		PrintWriter pw=null;
		
		try {
			fw = new FileWriter(file);  // La parte derecha siempre debe ir en el try
			pw = new PrintWriter(fw);
			
			for (char letra='a'; letra<='z'; letra++) {
				pw.println(letra);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			pw.close();
			try {
				fw.close();
			}
			catch(IOException e){
					e.printStackTrace();
			}
		}
	}		
}


