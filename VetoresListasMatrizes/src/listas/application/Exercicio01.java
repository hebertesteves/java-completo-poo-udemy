package listas.application;

import listas.entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        List<Funcionarios> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Funcionarios(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        int result = -1;
        for (Funcionarios x : list) {
            if (x.getId() == id) {
                result = id;
                break;
            }
        }

        if (result != -1) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            for (Funcionarios x : list) {
                if (x.getId() == id) {
                    x.aumentarSalario(percentage);
                }
            }
        } else {
            System.out.println("This id does not exist!");
        }
        System.out.println();

        System.out.println("List of employees: ");
        for (Funcionarios x : list) {
            System.out.println(x);
        }

        sc.close();
    }
}
