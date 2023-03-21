package ro.ase.csie.cts.seminar03.phase04;

public interface IMarketingStrategy {
    public static final int MIN_ACCOUNT_AGE = 10;
    public static final float MAX_USER_BONUS = 0.15f;

    public abstract float GetUserDiscount(
            int userAccountAge
    );

    public abstract float GetPriceWithAllDiscounts(
            ProductType productType,
            float productPrice,
            int userAccountAge,
            IAccounting accounting
    );
}
