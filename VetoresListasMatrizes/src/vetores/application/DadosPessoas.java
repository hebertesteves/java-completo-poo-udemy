package vetores.application;

import vetores.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Altura da %d pessoa: ", (i + 1));
            double altura = sc.nextDouble();

            System.out.printf("Genero da %d pessoa: ", (i + 1));
            char genero = sc.next().toUpperCase().charAt(0);

            vect[i] = new Pessoa(altura, genero);
        }

        double menorAltura = vect[0].getAltura();
        for (int i = 1; i < vect.length; i++) {
            if (vect[i].getAltura() < menorAltura) menorAltura = vect[i].getAltura();
        }
        System.out.printf("Menor altura = %.2f%n", menorAltura);

        double maiorAltura = vect[0].getAltura();
        for (int i = 1; i < vect.length; i++) {
            if (vect[i].getAltura() > maiorAltura) maiorAltura = vect[i].getAltura();
        }
        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        double somaAlturaMulheres = 0.0;
        int quantidadeMulheres = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getGenero() == 'F') {
                quantidadeMulheres++;
                somaAlturaMulheres += vect[i].getAltura();
            }
        }
        double mediaAlturaMulheres = somaAlturaMulheres / quantidadeMulheres;
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);

        int quantidadeHomens = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getGenero() == 'M') quantidadeHomens++;
        }
        System.out.printf("Numero de homens = %d%n", quantidadeHomens);

        sc.close();
    }
}
