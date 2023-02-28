package ro.ase.csie.cts.sem.g1096.recap.models;

import ro.ase.csie.cts.sem.g1096.recap.exception.InsufficientFundsException;

public class SavingsAccount extends BankAccount {
    public static final double MIN_BALANCE = 100;

    public SavingsAccount(double balance, String iban) {
        super(balance, iban);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (this.balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException("Debit finished!");
        }

        this.balance -= amount;
    }
}
