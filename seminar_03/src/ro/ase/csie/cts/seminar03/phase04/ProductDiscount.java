package ro.ase.csie.cts.seminar03.phase04;

public class ProductDiscount {
    IAccounting accounting;
    IMarketingStrategy marketingStrategy;

    // constructor injection - DIP
    public ProductDiscount(
            IAccounting accounting,
            IMarketingStrategy marketingStrategy
    ) {
        if (accounting == null || marketingStrategy == null) {
            throw new NullPointerException("CHECK YOUR REFERENCES!");
        }
        this.accounting = accounting;
        this.marketingStrategy = marketingStrategy;
    }

    // setter injection - DIP
    public void setAccounting(IAccounting accounting) {
        if (accounting == null)
            throw new NullPointerException("IAccounting reference NULL");
        this.accounting = accounting;
    }

    public void setMarketingStrategy(IMarketingStrategy marketingStrategy) {
        if (marketingStrategy == null)
            throw new NullPointerException("IMarketingStrategy reference NULL");
        this.marketingStrategy = marketingStrategy;
    }

    public float GetDiscountValue(
            ProductType type,
            float productPrice
    ) {
        return accounting.GetDiscountValue(type, productPrice);
    }

    protected float GetPriceWithDiscount(
            ProductType type,
            float productPrice
    ) {
        return accounting.GetPriceWithDiscount(type, productPrice);
    }

    public float GetPriceWithDiscountAndWithUserBonus(
            ProductType productType,
            float productPrice,
            int userAccountAge
    ) {
        return marketingStrategy.GetPriceWithAllDiscounts(productType, productPrice, userAccountAge, accounting);
    }
}
