package utilities;

public class EscribirAbecedario {

	
	public static void AbcWhile() {
		
		char letra='a';
		while (letra<='z') {
			System.out.println(letra);
			letra++;
		}
	}
	
	
	public static void AbcFor() {
		
		for (char letra='a'; letra<='z';letra++){
			System.out.println(" " +letra+',');
		} 
	}
	
	
	public static void AbcDoWhile() {
		char letra='a';
		
		do {
			System.out.println(" " +letra+',');
			letra++;
		}while(letra<='z');
	}
	
}
