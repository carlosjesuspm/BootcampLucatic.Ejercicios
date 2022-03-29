package utilities;
import java.util.Scanner;

public class LecturaDatos {
		
		
	@SuppressWarnings("resource")
	public static String LeerTexto(){
		Scanner teclado=new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static String LeerTexto(String msg){
		System.out.println(msg);
		return LeerTexto();
	}		

}
