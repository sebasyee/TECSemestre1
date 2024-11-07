import java.util.*;
public class Adivinar {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int intento,num = rnd.nextInt(101);
		System.out.println("Adivina el numero de el 1 al 100");
		do {
			
		    intento = sc.nextInt();
			if(num>intento) {
				System.out.println("El numero es mayor. Intenta de nuevo");
			}
			else {
				System.out.println("El numero es menor. Intenta de nuevo");
			}
		}
		while(!(num==intento));
	}

}
