package ro.csie.ase.cts.design_patterns.strategy;

public class MonthlySubscription {
    private float amount;
    private String username;
    private IPayment paymentMethod = null;

    public MonthlySubscription(float amount, String username) {
        super();
        this.amount = amount;
        this.username = username;
    }

    public void pay() {
        // System.out.printf("Pay $%.2f with PayPal%n", this.amount);
        if (this.paymentMethod != null) {
            this.paymentMethod.executePayment(this.amount);
        } else {
            throw new UnsupportedOperationException("Payment method not set.");
        }
    }

    public void setPaymentMethod(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
