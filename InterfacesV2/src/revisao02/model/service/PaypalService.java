package revisao02.model.service;

public class PaypalService implements OnlinePaymentService {
    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, int months) {
        return 0.01 * amount * months;
    }
}
