package exemplo5.application;

import exemplo5.entities.Circle;
import exemplo5.entities.enums.Color;
import exemplo5.entities.Rectangle;
import exemplo5.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char type = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
            String textColor = sc.nextLine();

            if (type == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                Shape shape = new Rectangle(Color.valueOf(textColor.toUpperCase()), width, height);
                list.add(shape);
            } else if (type == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                Shape shape = new Circle(Color.valueOf(textColor.toUpperCase()), radius);
                list.add(shape);
            }
        }
        System.out.println();

        System.out.println("SHAPE AREAS: ");
        for (Shape s : list) {
            System.out.printf("%.2f%n", s.area());
        }

        sc.close();
    }
}
