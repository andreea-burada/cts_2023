package ro.ase.csie.cts.sem.g1096.recap.main;

import ro.ase.csie.cts.sem.g1096.recap.models.AccountType;
import ro.ase.csie.cts.sem.g1096.recap.models.Bank;
import ro.ase.csie.cts.sem.g1096.recap.models.BankAccount;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank randomBank = new Bank("TEST");
		BankAccount account = randomBank.openAccount(AccountType.CREDIT);
		randomBank.openAccount(AccountType.SAVINGS);
		System.out.println(account);
	}

}
