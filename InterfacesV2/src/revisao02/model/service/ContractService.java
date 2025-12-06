package revisao02.model.service;

import revisao02.model.entities.Contract;
import revisao02.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService service;

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }

    public void processContract(Contract contract, int months) {
        double parcelas = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate nextMonth = contract.getDate().plusMonths(i);
            double interest = service.interest(parcelas, i);
            double paymentFee = service.paymentFee(parcelas + interest);
            double amount = paymentFee + parcelas + interest;

            contract.getInstallments().add(new Installment(nextMonth, amount));
        }
    }
}
