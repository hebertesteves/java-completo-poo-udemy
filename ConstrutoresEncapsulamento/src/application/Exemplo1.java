package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        System.out.println();

        Product product = new Product(name, price, quantity);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());

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
