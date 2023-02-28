package ro.ase.csie.cts.sem.g1096.recap.models;

import ro.ase.csie.cts.sem.g1096.recap.exception.InsufficientFundsException;

public class CurrentAccount extends BankAccount {
    public static final double MAX_CREDIT = 5000;

    public CurrentAccount(String iban) {
        super(CurrentAccount.MAX_CREDIT, iban);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > this.balance) {
            throw new InsufficientFundsException("Credit finished!");
        }

        this.balance -= amount;
    }
}
