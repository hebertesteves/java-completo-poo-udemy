import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();
        double salario = horasTrabalhadas * valorPorHora;
        System.out.printf("NUMBER = %d%n", numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
