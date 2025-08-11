package exemplo01_v1.model.services;

public class BrazilTaxService {
    public double tax(double amount) {
        return amount > 100.0
                ? amount * 0.15
                : amount * 0.2;
    }
}
