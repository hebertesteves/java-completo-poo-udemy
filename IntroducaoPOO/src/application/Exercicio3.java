package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.setName(sc.nextLine());
        student.setGrade1(sc.nextDouble());
        student.setGrade2(sc.nextDouble());
        student.setGrade3(sc.nextDouble());

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
        student.missingPoints();

        sc.close();
    }
}
