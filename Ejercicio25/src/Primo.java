import java.util.Scanner;
public class Primo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa un numero");
		int num = sc.nextInt();
		if(num <=1) {
			System.out.println("No es numero primo");
		}
		else {
			boolean primo = true;
			for (int i = 2; i* i<= num; i++) {
				if (num % i == 0) {
					primo = false;
				}
			}
			if(primo) {
				System.out.println("El numero es primo");
			}
			else {
				System.out.println("El numero NO es primo");
			}
		}
		

	}

}
