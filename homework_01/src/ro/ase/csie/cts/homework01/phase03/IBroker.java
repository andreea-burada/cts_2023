package ro.ase.csie.cts.homework01.phase03;

public interface IBroker {
    public boolean IsObligedToPayBrokerFee(AccountType accountType);

    public double GetNumberOfPeriods(int daysActive);

    public double GetCumulativeInterestRate(double interestRate, int daysActive);

    public double GetInterestMinusPrincipal(double loanValue, double interestRate, int daysActive);

    public double CalculateTotalBrokerageFee(Account[] accounts);
}
