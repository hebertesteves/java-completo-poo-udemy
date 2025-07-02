import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fatorial = 1;
        for (int i = n; i >= 1 ; i--) {
            fatorial *= i;
        }

        System.out.printf("%d%n", fatorial);

        sc.close();
    }
}
