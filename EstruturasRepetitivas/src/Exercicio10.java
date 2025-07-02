import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int quadradoNumero = i * i;
            int cuboNumero = i * i * i;

            System.out.printf("%d %d %d%n", i, quadradoNumero, cuboNumero);
        }
        
        sc.close();
    }
}
