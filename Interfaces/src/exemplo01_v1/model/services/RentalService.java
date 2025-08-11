package exemplo01_v1.model.services;

import exemplo01_v1.model.entities.CarRental;
import exemplo01_v1.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double hours = (Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes()) / 60.0;

        double basicPayment = hours > 12
                ? Math.ceil(hours / 24.0) * pricePerDay
                : Math.ceil(hours) * pricePerHour;

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
