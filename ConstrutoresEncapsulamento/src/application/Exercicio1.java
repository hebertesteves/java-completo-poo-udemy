package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n): ");
        char resp = sc.next().toLowerCase().charAt(0);

        Account account;
        if (resp == 'y') {
            System.out.print("Enter initial deposit value: ");
            double value = sc.nextDouble();
            account = new Account(number, name, value);
        } else {
            account = new Account(number, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
