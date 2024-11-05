import java.util.Scanner;
public class Nums {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String allNums="";
		int num,i=0,cociente;
		do {
			System.out.println("Ingresa un numero");
		    num = sc.nextInt();
		    cociente = num % 3;
		    allNums = Integer.toString(num);
		    if(cociente == 0) {
		    	i++;
		    }
		}
		while (!(num==0));
		System.out.println("Multiplos de 3: "+i);
		System.out.println(allNums);

	}

}
