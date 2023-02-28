package ro.ase.csie.cts.sem.g1096.recap.models;

import ro.ase.csie.cts.sem.g1096.recap.exception.IllegalTransferException;
import ro.ase.csie.cts.sem.g1096.recap.exception.InsufficientFundsException;

public abstract class BankAccount extends Account {
    protected double balance;
    protected String iban;

    public BankAccount(double balance, String iban) {
        super();
        this.balance = balance;
        this.iban = iban;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    // managed exception -> extends Exception
    // unmanaged exception -> extends RuntimeException
    @Override
    public void transfer(Account destination, double amount) throws IllegalTransferException, InsufficientFundsException {
        // we must check if the destination can be down-casted
        BankAccount destinationAccount = null;
        if (destination instanceof BankAccount) {
            destinationAccount = (BankAccount) destination;
        } else {
            throw new IllegalTransferException();
        }

        if (this == destination || this.iban.equals(destinationAccount.iban)) {
            throw new IllegalTransferException();
        }

        this.withdraw(amount);
        destination.deposit(amount);
    }
}