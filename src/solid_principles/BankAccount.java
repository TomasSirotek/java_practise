package solid_principles;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void receiveTransfer(double amount) {
        balance += amount;
    }
    public abstract void withdraw(double amount);

    public abstract void transferTo(BankAccount toAccount, double amount);
}
