import java.util.Scanner;

public class NumTelefono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numTel,numFormat;

        for (int i = 0; i < 8; i++) {
            do {
                System.out.println("Ingresa un número de teléfono de 10 dígitos");
                numTel = sc.nextLine();
                
                if (numTel.length() != 10) {
                    System.out.println("El número ingresado no es valido. Inténtalo de nuevo.");
                }
            } 
            while (numTel.length() != 10);
            numFormat = "("+ numTel.substring(0, 3)+")"+" "+numTel.substring(3, 6)+"-"+numTel.substring(6, 8)+"-"+numTel.substring(8, 10);
            System.out.println("Numero con formato: "+numFormat);

        }
    }
}
