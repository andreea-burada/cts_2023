package ro.ase.csie.cts.sem.g1096.recap.models;

import java.util.HashMap;

public class Bank {
    // factory class
    // has a collection of accounts and can generate new accounts
    String name;
    int nextIBAN;
    HashMap<String, BankAccount> accounts = new HashMap<>();

    public Bank(String name) {
        this.name = name;
        this.nextIBAN = 1;
    }

    public BankAccount openAccount(AccountType type) {
        String nextIBANValue = this.name + (this.nextIBAN++);
        BankAccount newAccount = null;
        switch(type) {
            case CREDIT:
                newAccount = new CurrentAccount(nextIBANValue);
                break;
            case SAVINGS:
                newAccount = new SavingsAccount(SavingsAccount.MIN_BALANCE, nextIBANValue);
                break;
            default:
                throw new UnsupportedOperationException();
        }

        this.accounts.put(nextIBANValue, newAccount);
        return newAccount;
    }
}
