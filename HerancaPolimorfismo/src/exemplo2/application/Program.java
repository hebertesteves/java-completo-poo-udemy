package exemplo2.application;

import exemplo2.entities.Account;
import exemplo2.entities.BusinessAccount;
import exemplo2.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account saac = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        saac.withdraw(200.0);
        System.out.println(saac.getBalance());

        BusinessAccount bacc = new BusinessAccount(1003, "Maria", 1000.0, 500.0);
        bacc.withdraw(200.0);
        System.out.println(bacc.getBalance());

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1004, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1005, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }
}
