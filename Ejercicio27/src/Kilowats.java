import java.util.Random;

public class Kilowats {
    public static void main(String[] args) {
        Random rnd = new Random();
        
        for (int i = 1; i <= 50; i++) {
            int lecAnt = rnd.nextInt(9000);
            int lecturaAct = lecAnt + rnd.nextInt(3000);
            int kw = lecturaAct - lecAnt;
            double costo = calcularCosto(kw);
            double total = costo * 1.16;
            
            System.out.printf("Usuario: %d\n", i);
            System.out.printf("Lectura anterior: %d\n", lecAnt);
            System.out.printf("Lectura actual: %d\n", lecturaAct);
            System.out.printf("KW: %d\n", kw);
            System.out.printf("Total a pagar: $%.2f\n\n", total);
        }
    }

    private static double calcularCosto(int kw) {
        double costo;
        if (kw >= 0 && kw < 300) {
            costo = kw * 0.45;
        } else if (kw < 451) {
            costo = kw * 0.68;
        } else if (kw > 1000) {
            costo = kw * 0.95;
        } else {
            costo = kw * 2.51;
        }
        return costo;
    }
}
