package ro.ase.csie.cts.seminar03.phase2;

public class ProductDiscount {
    public static final int MIN_ACCOUNT_AGE = 10;
    public static final float MAX_USER_BONUS = 0.15f;

    public float GetPriceWithDiscount(
            ProductType productType,
            float productPrice,
            int userAccountAge) {

        float userBonusDiscount = (userAccountAge > MIN_ACCOUNT_AGE) ? MAX_USER_BONUS : (float) userAccountAge / 100;

        switch (productType) {
            case NEW: {
                return productPrice;
            }
            case SILVER: {
                return (productPrice - (ProductType.SILVER.getDiscount() * productPrice)) - userBonusDiscount * (productPrice - (ProductType.SILVER.getDiscount() * productPrice));
            }
            case GOLD: {
                return (productPrice - (ProductType.GOLD.getDiscount() * productPrice)) - userBonusDiscount * (productPrice - (ProductType.GOLD.getDiscount() * productPrice));
            }
            case DIAMOND: {
                return (productPrice - (ProductType.DIAMOND.getDiscount() * productPrice)) - userBonusDiscount * (productPrice - (ProductType.DIAMOND.getDiscount() * productPrice));
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }
}
