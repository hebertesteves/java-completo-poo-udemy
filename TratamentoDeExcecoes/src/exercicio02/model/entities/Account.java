package exercicio02.model.entities;


import exercicio02.model.exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new BusinessException("Deposit amount must be greater than zero");
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > withdrawLimit) {
            throw new BusinessException("The amount exceeds withdraw limit");
        }

        if (amount > balance) {
            throw new BusinessException("Not enough balance");
        }

        balance -= amount;
    }
}
