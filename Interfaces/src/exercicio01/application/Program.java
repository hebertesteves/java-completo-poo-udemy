package exercicio01.application;

import exercicio01.model.entities.Contract;
import exercicio01.model.entities.Installment;
import exercicio01.model.services.ContractService;
import exercicio01.model.services.PaypayService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int months = sc.nextInt();

        ContractService contractService = new ContractService(new PaypayService());
        contractService.processContract(contract, months);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(fmt.format(installment.getDueDate()) + " - " + String.format("%.2f", installment.getAmount()));
        }

        sc.close();
    }
}
