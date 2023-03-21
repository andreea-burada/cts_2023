package ro.ase.csie.cts.seminar03.main;

import ro.ase.csie.cts.seminar03.phase04.Accounting;
import ro.ase.csie.cts.seminar03.phase04.BlackFridayStrategy;
import ro.ase.csie.cts.seminar03.phase04.ProductDiscount;
import ro.ase.csie.cts.seminar03.phase04.ProductType;

public class TestMain {
    public static void main(String[] args) {
        ProductDiscount productDiscount = new ProductDiscount(
                new Accounting(),
                new BlackFridayStrategy()
        );
        float finalPrice = productDiscount.GetPriceWithDiscountAndWithUserBonus(
                ProductType.SILVER,
                100,
                20
        );
        System.out.println("Final price is " + finalPrice);
    }
}
