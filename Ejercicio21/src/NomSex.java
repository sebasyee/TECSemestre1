import java.util.Scanner;
public class NomSex {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String nom,sex;
	int h=0,m=0;
	
	for(int i=0; i<10;i++) {
		System.out.println("Ingresa un nombre");
		nom = sc.nextLine();
		System.out.println("Ingresa el sexo: H o M");
		sex = sc.nextLine();
		if(sex.equalsIgnoreCase("H")) {
			h++;
		}
		else {
			m++;
		}
	}
		
		System.out.println("Total de hombres: "+h);
		System.out.println("Total de mujeres: "+m);
	}
}


