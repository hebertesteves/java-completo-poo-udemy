import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, numPeca1, cod2, numPeca2;
        double valorPeca1, valorPeca2, valorTotal;

        cod1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        cod2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorTotal = numPeca1 * valorPeca1 + numPeca2 * valorPeca2;
        System.out.printf("VALOR A PAGAR = R$ %.2f%n", valorTotal);

        sc.close();
    }
}
