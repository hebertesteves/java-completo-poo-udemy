package exemplo01_v2.application;

import exemplo01_v2.model.entities.CarRental;
import exemplo01_v2.model.entities.Vehicle;
import exemplo01_v2.model.services.BrazilTaxService;
import exemplo01_v2.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(new Vehicle(carModel), start, finish);

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.printf("Pagamento básico: %.2f%n", cr.getInvoice().getBasicPayment());
        System.out.printf("Imposto: %.2f%n", cr.getInvoice().getTax());
        System.out.printf("Pagamento total: %.2f%n", cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
