package oop_basics.banking_app;

import oop_basics.banking_app.accounts.Account;
import oop_basics.banking_app.accounts.CheckingAccount;
import oop_basics.banking_app.accounts.SavingAccount;

public class Main {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(200,420);
        SavingAccount savingAccount = new SavingAccount(200);

        checkingAccount.status();
        savingAccount.status();

        checkingAccount.withdraw(10);
        savingAccount.withdraw(10);


        System.out.println();

        checkingAccount.status();
        savingAccount.status();

    }
}
