package revisao01;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int quantityA = sc.nextInt();

        for (int i = 0; i < quantityA; i++) {
            int id = sc.nextInt();
            set.add(id);
        }

        System.out.print("How many students for course B? ");
        int quantityB = sc.nextInt();

        for (int i = 0; i < quantityB; i++) {
            int id = sc.nextInt();
            set.add(id);
        }

        System.out.print("How many students for course C? ");
        int quantityC = sc.nextInt();

        for (int i = 0; i < quantityC; i++) {
            int id = sc.nextInt();
            set.add(id);
        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}
