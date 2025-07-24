package application;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1SemPOO {
    public static void main(String[] args) {
        // Problema Exemplo sem POO
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC;
        double yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pA = (xA + xB + xC) / 2.0;
        double pB = (yA + yB + yC) / 2.0;

        double areaX = Math.sqrt(pA * (pA - xA) * (pA - xB) * (pA - xC));
        double areaY = Math.sqrt(pB * (pB - yA) * (pB - yB) * (pB - yC));

        System.out.printf("entities.Triangle X area: %.4f%n", areaX);
        System.out.printf("entities.Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
