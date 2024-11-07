import java.util.Scanner;
public class BinarioDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número binario:");
        String binario = sc.nextLine();
        int decimal = 0;
        int longitud = binario.length();
        
        for (int i = 0; i < longitud; i++) {
            char num = binario.charAt(longitud - 1 - i);
            
            if (num == '1') {
                decimal += Math.pow(2, i);
            } else if (num != '0') {
                System.out.println("El número ingresado no es un binario válido.");
                return;
            }
        }
   
        System.out.println("El número decimal es: " + decimal);
    }
}
