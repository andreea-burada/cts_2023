package ro.ase.csie.cts.seminar03.phase04;

public class BlackFridayStrategy implements IMarketingStrategy {
    @Override
    public float GetUserDiscount(
            int userAccountAge
    ) {
        return (userAccountAge > MIN_ACCOUNT_AGE) ? MAX_USER_BONUS : (float) userAccountAge / 100;
    }

    @Override
    public float GetPriceWithAllDiscounts(
            ProductType productType,
            float productPrice,
            int userAccountAge,
            IAccounting accounting
    ) {
        float userBonusDiscount = productType == ProductType.NEW ? 0 : GetUserDiscount(userAccountAge);

        return accounting.GetPriceWithDiscount(productType, productPrice) * (1 - userBonusDiscount);
    }
}
