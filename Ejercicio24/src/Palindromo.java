import java.util.Scanner;
public class Palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa un texto");
		String text=sc.nextLine();
		boolean palindromo=true;
		int longi=text.length();
		
		for(int i=0; i<longi; i++) {
			if(text.charAt(i) !=text.charAt(longi - i - 1)) {
				palindromo=false;
			}
		}
		if(palindromo) {
			System.out.println("Si es palindromo");
		}
		else {
			System.out.println("No es");
		}
		
			
		
			
	}

}
