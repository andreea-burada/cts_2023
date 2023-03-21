package ro.ase.csie.cts.seminar03.phase03;

public class ProductDiscount {

    public float GetDiscountValue(
            ProductType type,
            float productPrice
    ) {
        return type.getDiscount() * productPrice;

    }

    public float GetPriceWithDiscount(
            ProductType type,
            float productPrice
    ) {
        return productPrice - GetDiscountValue(type, productPrice);
    }

    public float GetPriceWithDiscountAndWithUserBonus(
            ProductType productType,
            float productPrice,
            int userAccountAge
    ) {
        float userBonusDiscount = productType == ProductType.NEW ? 0 : UserDiscount.GetUserDiscount(userAccountAge);

        return GetPriceWithDiscount(productType, productPrice) * (1 - userBonusDiscount);
    }
}
