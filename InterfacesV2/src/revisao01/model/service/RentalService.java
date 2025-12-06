package revisao01.model.service;

import revisao01.model.entities.CarRental;
import revisao01.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService() {
    }

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

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double duration = Math.ceil(Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes() / 60.0);
        double basicPayment;

        if (duration > 12) {
            int days = (int) Math.ceil(duration / 24);
            basicPayment = days * pricePerDay;
        } else {
            basicPayment = duration * pricePerHour;
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
