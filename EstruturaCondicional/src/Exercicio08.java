import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioBruto = sc.nextDouble();
        double impostoDevido = 0.0;

        if (salarioBruto >= 0.0 && salarioBruto <= 2000.00) {
            impostoDevido = 0.0;
        } else if (salarioBruto > 2000.00 && salarioBruto <= 3000.00) {
            impostoDevido = (salarioBruto - 2000) * 0.08;
        } else if (salarioBruto > 3000.00 && salarioBruto <= 4500.00) {
            impostoDevido = (1000 * 0.08) + ((salarioBruto - 3000) * 0.18);
        } else {
            impostoDevido = (1000 * 0.08) + (1500 * 0.18) + ((salarioBruto - 4500) * 0.28);
        }

        if (impostoDevido == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", impostoDevido);
        }

        sc.close();
    }
}
