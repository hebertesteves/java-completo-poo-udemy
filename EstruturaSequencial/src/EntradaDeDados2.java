import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        /* Exercicio Resolvido 01 */
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double valorPorMetro = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * valorPorMetro;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
}
