package solid_principles;

public class CreditCardAccount extends BankAccount{
    public CreditCardAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void transferTo(BankAccount toAccount, double amount) {
        withdraw(amount);
        toAccount.receiveTransfer(amount);
    }
}
