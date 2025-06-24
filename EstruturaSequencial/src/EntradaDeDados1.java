import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        System.out.println("Você digitou: " + x);

        double y;
        y = sc.nextDouble();
        System.out.println("Você digitou: " + y);

        char z;
        z = sc.next().charAt(0);
        System.out.println("Você digitou: " + z);

        sc.close();
    }
}
