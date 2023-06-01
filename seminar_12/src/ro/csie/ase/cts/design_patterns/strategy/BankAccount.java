package ro.csie.ase.cts.design_patterns.strategy;

public class BankAccount implements IPayment {
    @Override
    public void executePayment(float amount) {
        System.out.printf("Bank transaction: paying $%.2f%n", amount);
    }
}
