package solid_principles;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {

    }

    public void transferTo(BankAccount toAccount, double amount) {
        withdraw(amount);
        toAccount.receiveTransfer(amount);
    }
}
