package exercicio02.application;

import exercicio02.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.println("Email of people whose salary is more than "+ String.format("%.2f", salary) + ":");

            Comparator<String> comp = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());

            List<String> emails = list.stream()
                    .filter(emp -> emp.getSalary() > salary)
                    .map(emp -> emp.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(emp -> emp.getName().toUpperCase().startsWith("M"))
                    .map(emp -> emp.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
