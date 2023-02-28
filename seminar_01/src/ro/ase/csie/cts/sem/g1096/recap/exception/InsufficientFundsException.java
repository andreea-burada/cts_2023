package ro.ase.csie.cts.sem.g1096.recap.exception;

// the name is the added value
// custom exceptions-> add extends Exception at the end
public class InsufficientFundsException extends Exception {  
	public InsufficientFundsException(String msg) {
		// only using the base class
		super(msg);
	}

}

