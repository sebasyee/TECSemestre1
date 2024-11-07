import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un texto");
        String text = sc.nextLine();
        int numDigitos = 0;
        int digitos = text.length();
        char caracteres;

        for (int i = 0; i < digitos; i++) {
            caracteres = text.charAt(i);

            if (Character.isDigit(caracteres)) {
                numDigitos++;
            }
        }

        System.out.println("El número de dígitos es: " + numDigitos);
    }
}
