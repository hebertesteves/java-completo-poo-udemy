package exemplo.application;

import exemplo.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {
        BusinessAccount account = new BusinessAccount(1000, "Hebert", 2000.00, 3000.00);
        account.deposit(1500.50);
        account.withdraw(500.50);
        account.loan(1000);

    }
}
