import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa un numero de el 0 al 10");
		int factorial=1,num=sc.nextInt();
		
		for(int i=1; i<=num;i++) {
			factorial=factorial*i;
			}
		
		System.out.println("El factorial de "+num+" es "+factorial);
		}
				
	}


