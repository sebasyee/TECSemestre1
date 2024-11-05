import java.util.Scanner;
public class TextoInvertido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un texto para mostrarlo al reves");
		String texto2="",texto1 = sc.nextLine();
		for(int i = texto1.length()-1; i>=0; i--)  {
			System.out.println(i);
			texto2 = texto2 + texto1.charAt(i);
		}
		System.out.println(texto2);
		
	}

}
