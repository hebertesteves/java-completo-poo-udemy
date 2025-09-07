package exercicio01.model.service;

import exercicio01.model.entities.Contract;
import exercicio01.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = paymentService.interest(basicQuota, i);
            double fee = paymentService.paymentFee(basicQuota + interest);
            double quota = fee + basicQuota + interest;

            contract.addContract(new Installment(dueDate, quota));
        }
    }
}
