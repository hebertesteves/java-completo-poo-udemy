package revisao01.application;

import revisao01.model.entities.CarRental;
import revisao01.model.entities.Vehicle;
import revisao01.model.service.BrazilTaxService;
import revisao01.model.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        CarRental carRental = new CarRental(start, finish, new Vehicle(model));
        RentalService service = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        service.processInvoice(carRental);

        System.out.println("FATURA: ");
        System.out.printf("Pagamento basico: %.2f%n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Imposto: %.2f%n", carRental.getInvoice().getTax());
        System.out.printf("Pagamento total: %.2f%n", carRental.getInvoice().getTotalPayment());

        sc.close();
    }
}
