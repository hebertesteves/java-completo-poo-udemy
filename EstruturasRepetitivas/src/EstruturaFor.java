import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }
        System.out.println();

        for (int i = 4; i >= 0; i--) {
            System.out.println("Valor de i: " + i);
        }

        sc.close();
    }
}
