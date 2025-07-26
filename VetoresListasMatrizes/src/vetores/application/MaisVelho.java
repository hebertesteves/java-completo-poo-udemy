package vetores.application;

import vetores.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
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

            vect[i] = new Pessoa(nome, idade);
        }

        int maisVelho = vect[0].getIdade();
        String pessoaMaisVelha = "";
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() > maisVelho) {
                maisVelho = vect[i].getIdade();
                pessoaMaisVelha = vect[i].getNome();
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);

        sc.close();
    }
}
