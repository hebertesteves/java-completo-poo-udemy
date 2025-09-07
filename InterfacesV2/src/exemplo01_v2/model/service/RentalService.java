package exemplo01_v2.model.service;

import exemplo01_v2.model.entites.CarRental;
import exemplo01_v2.model.entites.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void processInvoice(CarRental carRental) {
        double durationHour = Math.ceil(Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes() / 60.0);

        double basicPayment;
        if (durationHour <= 12.0) {
            basicPayment = durationHour * pricePerHour;
        } else {
            int durationDays = (int) Math.ceil(durationHour / 24);
            basicPayment = durationDays * pricePerDay;
        }

        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
