package exercicio03.application;

import exemplo.entities.enums.OrderStatus;
import exercicio03.entities.Client;
import exercicio03.entities.Order;
import exercicio03.entities.OrderItem;
import exercicio03.entities.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYY): ");
        String birthDateText = sc.nextLine();

        Client client = new Client(clientName, clientEmail, LocalDate.parse(birthDateText, fmt1));

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Order order = new Order(OrderStatus.valueOf(status.toUpperCase()), client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data: ");

            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, product);
            order.addItem(orderItem);
        }
        System.out.println();

        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        sc.close();
    }
}
