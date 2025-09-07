package exercicio01.model.service;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
