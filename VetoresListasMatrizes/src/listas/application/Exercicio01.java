package listas.application;

import listas.entities.Employee;

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

        List<Employee> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + ":");

            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        //Integer pos = position(list, idSalary);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();

            emp.increaseSalary(percent);
        }
        System.out.println();

        System.out.println("List of employees: ");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, Integer id) {
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i).getId().equals(id)) return i;
         }

         return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
