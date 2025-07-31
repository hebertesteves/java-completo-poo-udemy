package exercicio01.application;

import exercicio01.entities.Department;
import exercicio01.entities.HourContract;
import exercicio01.entities.Worker;
import exercicio01.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel.toUpperCase()), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();

            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            String dateText = sc.nextLine();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(LocalDate.parse(dateText, fmt1), valuePerHour, hours);
            worker.addContract(contract);
        }
        sc.nextLine();
        System.out.println();

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String yearAndMonth = sc.nextLine();

        int month = Integer.parseInt(yearAndMonth.substring(0, 2));
        int year = Integer.parseInt(yearAndMonth.substring(3));
        double income = worker.income(month, year);

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + yearAndMonth + ": " + String.format("%.2f", income));

        sc.close();
    }
}
