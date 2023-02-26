package solid_principles;

public class Main {
    public static void main(String[] args) {
        BankAccount checkingAccount = new CheckingAccount("1234567890", 1000);
        BankAccount savingsAccount = new CreditCardAccount("0987654321", 5000);

        System.out.println("Initial balances:");
        System.out.println(checkingAccount.getAccountNumber() + ": " + checkingAccount.getBalance());
        System.out.println(savingsAccount.getAccountNumber() + ": " + savingsAccount.getBalance());

        checkingAccount.deposit(500);
        savingsAccount.receiveTransfer(1000);

        System.out.println("\nAfter deposits:");
        System.out.println(checkingAccount.getAccountNumber() + ": " + checkingAccount.getBalance());
        System.out.println(savingsAccount.getAccountNumber() + ": " + savingsAccount.getBalance());

        checkingAccount.withdraw(200);
        savingsAccount.transferTo(checkingAccount, 1500);

        System.out.println("\nAfter withdrawals and transfers:");
        System.out.println(checkingAccount.getAccountNumber() + ": " + checkingAccount.getBalance());
        System.out.println(savingsAccount.getAccountNumber() + ": " + savingsAccount.getBalance());

    }
}
