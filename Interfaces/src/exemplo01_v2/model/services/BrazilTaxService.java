package exemplo01_v2.model.services;

public class BrazilTaxService implements TaxService {
    public double tax(double amount) {
        return amount > 100.0
                ? amount * 0.15
                : amount * 0.2;
    }
}
