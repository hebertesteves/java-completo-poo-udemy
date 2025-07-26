package vetores.application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println();

        double maior = vect[0];
        int posicao = 0;
        for (int i = 1; i < vect.length; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
                posicao = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f%n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posicao);

        sc.close();
    }
}
