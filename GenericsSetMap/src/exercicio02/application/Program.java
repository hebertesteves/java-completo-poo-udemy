package exercicio02.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> alunos = new HashSet<>();

        System.out.print("How many students for course A? ");
        int quantityA = sc.nextInt();

        for (int i = 0; i < quantityA; i++) {
            alunos.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        int quantityB = sc.nextInt();

        for (int i = 0; i < quantityB; i++) {
            alunos.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        int quantityC = sc.nextInt();

        for (int i = 0; i < quantityC; i++) {
            alunos.add(sc.nextInt());
        }

        System.out.println("Total students: " + alunos.size());

        sc.close();
    }
}
