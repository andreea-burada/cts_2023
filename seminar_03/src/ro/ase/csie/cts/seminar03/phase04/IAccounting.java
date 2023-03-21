package ro.ase.csie.cts.seminar03.phase04;

public interface IAccounting {
    public abstract float GetDiscountValue(
            ProductType type,
            float productPrice
    );

    public abstract float GetPriceWithDiscount(
            ProductType type,
            float productPrice
    );
}
