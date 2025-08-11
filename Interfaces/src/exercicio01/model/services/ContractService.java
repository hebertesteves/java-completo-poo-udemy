package exercicio01.model.services;

import exercicio01.model.entities.Contract;
import exercicio01.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double amount = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate plusMonths = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(amount, i) + amount;
            double paymentFee = onlinePaymentService.paymentFee(interest) + interest;
            contract.addInstallments(new Installment(plusMonths, paymentFee));
        }
    }
}
