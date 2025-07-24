package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.setName(sc.nextLine());

        System.out.print("Price: ");
        product.setPrice(sc.nextDouble());

        System.out.print("Quantity in stock: ");
        product.setQuantity(sc.nextInt());
        System.out.println();

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println("Updated data: " + product);

        sc.close();
    }
}
