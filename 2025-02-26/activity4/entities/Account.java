package activity4.entities;

public class Account {
    private final int number;
    private final String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getWithdrawLimit() {
        return this.withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > this.withdrawLimit) {
            throw new Exception("The amount exceeds withdraw limit");
        } else if (amount > this.balance) {
            throw new Exception("Not enough balance");
        }

        this.balance -= amount;
    }
}
