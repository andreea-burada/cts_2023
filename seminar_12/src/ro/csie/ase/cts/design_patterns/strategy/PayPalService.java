package ro.csie.ase.cts.design_patterns.strategy;

public class PayPalService implements IPayment {
    @Override
    public void executePayment(float amount) {
        System.out.printf("PayPal service: paying $%.2f%n", amount);
    }
}
