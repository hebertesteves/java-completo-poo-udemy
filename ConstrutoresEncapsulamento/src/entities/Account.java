package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= this.getBalance()) {
            this.balance -= amount + 5.0;
        }
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f", this.getNumber(), this.getHolder(), this.getBalance());
    }
}
