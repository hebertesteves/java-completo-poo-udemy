package vetores.application;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();

        int quantidadePares = 0;
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                quantidadePares++;
                System.out.printf("%d  ", numeros[i]);
            }
        }
        System.out.println();

        System.out.printf("QUANTIDADE DE PARES = %d%n", quantidadePares);

        sc.close();
    }
}
