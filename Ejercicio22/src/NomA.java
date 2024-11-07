import java.util.Scanner;
public class NomA {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nom,letra;
		int a=0;
		
		for(int i=0;i<10;i++) {
			System.out.println("Ingresa un nombre");
			nom = sc.nextLine();
		    
			if(nom.charAt(0)=='a'||nom.charAt(0)=='A') {
				a++;
			}
		}
			System.out.println("Nombres que empiezan con A: "+a);
		
	}

}
