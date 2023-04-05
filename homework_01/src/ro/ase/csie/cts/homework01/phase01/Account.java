package ro.ase.csie.cts.homework01.phase01;

public final class Account {
    // ATTRIBUTES
    private double loanValue;
    private double interestRate;
    private int daysActive;
    private AccountType accountType;
    public static final int PERIODS = 365;
    public static final double BROKER_FEE = .0125;

    // CONSTRUCTORS
    public Account(
            double loanValue,
            double interestRate,
            int daysActive,
            AccountType accountType
    ) throws IllegalArgumentException {
        if (loanValue < 0)
            throw new IllegalArgumentException("Loan value cannot be negative.");
        this.loanValue = loanValue;
        this.interestRate = interestRate;
        this.daysActive = daysActive;
        this.accountType = accountType;
    }

    // BUSINESS LOGIC
    // must have method - the lead has requested it in all classes
    public double getMonthlyRate() {
        return loanValue * interestRate;
    }

    public static double calculateTotalBrokerageFee(Account[] accounts) {
        double totalFee = 0.0;
        for (Account account : accounts) {
            if (account.accountType == AccountType.PREMIUM || account.accountType == AccountType.SUPER_PREMIUM)
                totalFee += Account.BROKER_FEE * (
                        account.loanValue * Math.pow(account.interestRate, (account.daysActive / Account.PERIODS)) - account.loanValue);    //	interest - principal
        }
        return totalFee;
    }

    // GETTERS & SETTERS
    public double getLoanValue() {
        System.out.println("The loan value is " + this.loanValue);
        return this.loanValue;
    }

    public void setLoanValue(double loanValue) throws IllegalArgumentException {
        if (loanValue < 0)
            throw new IllegalArgumentException("Loan value cannot be negative.");
        this.loanValue = loanValue;
    }

    public double getInterestRate() {
        System.out.println("The rate is " + this.interestRate);
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getDaysActive() {
        return daysActive;
    }

    public void setDaysActive(int daysActive) {
        if (daysActive < 0)
            throw new IllegalArgumentException("Days active cannot be negative.");
        this.daysActive = daysActive;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    // OVERRIDE BASIC METHODS
    @Override
    public String toString() {
        return "Account - { loanValue: " +
                this.loanValue +
                ", interestRate: " +
                this.interestRate +
                ", daysActive: " +
                this.daysActive +
                ", accountType: " +
                this.accountType +
                " };";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Account otherAccount))
            return false;
        return otherAccount.loanValue == this.loanValue
                && otherAccount.interestRate == this.interestRate
                && otherAccount.accountType == this.accountType
                && otherAccount.daysActive == this.daysActive;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + String.valueOf(this.loanValue).hashCode();
        result = 31 * result + String.valueOf(this.interestRate).hashCode();
        result = 31 * result + String.valueOf(this.daysActive).hashCode();
        if (this.accountType != null)
            result = 31 * result + this.accountType.hashCode();
        return result;
    }
}
