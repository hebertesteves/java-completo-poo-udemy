package exercicio03.application;

import exercicio03.entities.Company;
import exercicio03.entities.Individual;
import exercicio03.entities.TaxPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPlayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax players: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax player #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name, annualIncome, healthExpenditures));
            } else if (type == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }
        System.out.println();

        System.out.println("TAXES PAID: ");
        for (TaxPlayer t : list) {
            System.out.printf("%s: $ %.2f%n", t.getName(), t.tax());
        }
        System.out.println();

        double totalTaxes = 0.0;
        for (TaxPlayer t : list) {
            totalTaxes += t.tax();
        }

        System.out.printf("TOTAL TAXES: $ %.2f%n", totalTaxes);

        sc.close();
    }
}
