package ro.ase.csie.cts.seminar03.phase04;

public enum ProductType {
    NEW(0, "New Product"),
    SILVER(0.1f, "Silver Product"),
    GOLD(0.25f, "Gold Product"),
    DIAMOND(0.35f, "Diamond Product");
    private float discount;
    private String name;

    // constructors for ENUM are ALWAYS private
    private ProductType(float discount, String name) {
        this.discount = discount;
        this.name = name;
    }

    public float getDiscount() {
        return discount;
    }

    public String getName() {
        return name;
    }
}
