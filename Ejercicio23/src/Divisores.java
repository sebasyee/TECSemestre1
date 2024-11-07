import java.util.Scanner;
public class Divisores {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i,num,divisor;
		System.out.println("Ingresa un numero");
		num=sc.nextInt();
		for(i=num; i>0; i--){
			divisor = num % i;
	
			if(divisor == 0) {
				System.out.println(i);
			}
		}
	}
}
