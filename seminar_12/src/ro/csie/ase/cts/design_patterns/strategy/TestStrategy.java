package ro.csie.ase.cts.design_patterns.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        MonthlySubscription monthlySubscription = new MonthlySubscription(9.99F, "admin");

        //monthlySubscription.pay();

        System.out.println();

        monthlySubscription.setPaymentMethod(new PayPalService());
        monthlySubscription.pay();

        System.out.println();

        monthlySubscription.setPaymentMethod(new BankAccount());
        monthlySubscription.pay();
    }
}
