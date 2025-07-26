package vetores.application;

import vetores.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: %n", (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
        }
        System.out.println();

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();
        }

        double media = soma / vect.length;
        System.out.printf("Altura média: %.2f%n", media);

        int quantidadePessoasMenos16 = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                quantidadePessoasMenos16++;
            }
        }

        double porcentagem = ((double) quantidadePessoasMenos16 / vect.length) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
