package exercicio02.application;

import exercicio02.entities.ImportedProduct;
import exercicio02.entities.Product;
import exercicio02.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char resp = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String productName = sc.nextLine();

            System.out.print("Price: ");
            double productPrice = sc.nextDouble();

            if (resp == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                Product product = new ImportedProduct(productName, productPrice, customsFee);
                list.add(product);
            } else if (resp == 'c') {
                Product product = new Product(productName, productPrice);
                list.add(product);
            } else if (resp == 'u') {
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dateText = sc.nextLine();
                DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                Product product = new UsedProduct(productName, productPrice, LocalDate.parse(dateText, fmt1));
                list.add(product);
            }
        }
        System.out.println();

        System.out.println("PRICE TAGS: ");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
