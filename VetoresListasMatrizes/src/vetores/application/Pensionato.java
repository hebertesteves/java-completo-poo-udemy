package vetores.application;

import vetores.entities.Rent;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        System.out.println();

        Rent[] rents = new Rent[10];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Rent #%d: %n", (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            rents[room] = new Rent(name, email);
            System.out.println();
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) System.out.println(i + ": " + rents[i]);
        }

        sc.close();
    }
}
