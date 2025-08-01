package exercicio01.application;

import exercicio01.entities.Employee;
import exercicio01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char resp = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (resp == 'n') {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            } else {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            }
        }
        System.out.println();

        System.out.println("PAYMENTS: ");
        for (Employee emp : list) {
            System.out.printf("%s - $ %.2f%n", emp.getName(), emp.payment());
        }

        sc.close();
    }
}
