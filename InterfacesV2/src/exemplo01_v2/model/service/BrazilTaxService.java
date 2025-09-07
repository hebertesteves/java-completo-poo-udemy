package exemplo01_v2.model.service;

public class BrazilTaxService implements TaxService {
    @Override
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.20;
        } else {
            return amount * 0.15;
        }
    }
}
