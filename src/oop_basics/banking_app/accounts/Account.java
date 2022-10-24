package oop_basics.banking_app.accounts;

public class Account {
    protected double balance;
    private double interestRate;

    public Account(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount){
        if(amount > balance){
            return false;
        }

        this.balance -= amount;
        return true;
    }

    public void deposit(double amount){
        this.balance += this.balance;
    }

    public void status(){
        System.out.printf("Balance: %.2f\n",this.balance);
    }
}
