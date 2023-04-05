package ro.ase.csie.cts.homework01.phase03;

public class Broker implements IBroker {
    public static final int PERIOD_LENGTH = 365;
    public static final double BROKER_FEE = .0125;

    @Override
    public boolean IsObligedToPayBrokerFee(AccountType accountType) {
        return (accountType == AccountType.PREMIUM || accountType == AccountType.SUPER_PREMIUM);
    }

    @Override
    public double GetNumberOfPeriods(int daysActive) {
        return daysActive / Broker.PERIOD_LENGTH;
    }

    @Override
    public double GetCumulativeInterestRate(double interestRate, int daysActive) {
        return Math.pow(interestRate, this.GetNumberOfPeriods(daysActive));
    }

    @Override
    public double GetInterestMinusPrincipal(double loanValue, double interestRate, int daysActive) {
        return loanValue * (this.GetCumulativeInterestRate(interestRate, daysActive) - 1);
    }

    @Override
    public double CalculateTotalBrokerageFee(Account[] accounts) {
        double totalFee = 0.0F;
        for (Account account : accounts) {
            if (this.IsObligedToPayBrokerFee(account.getAccountType()))
                totalFee += Broker.BROKER_FEE * this.GetInterestMinusPrincipal(account.getLoanValue(), account.getInterestRate(), account.getDaysActive());
        }
        return totalFee;
    }
}
