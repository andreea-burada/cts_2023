package ro.ase.csie.cts.homework02.factory;

// 3. The drone can be accessorized with different modules (night vision, GPS tracking, high resolution camera,
// smart tracking, extra battery, etc). The modules framework extends the AbstractModule class. Because each module
// has its unique attributes (2-3 more attributes + the ones from AbstractModule) and that might change soon,
// implement an intermediary layer that will allow other developers to create/use different modules in a simplified
// way and independent of future changes.
public abstract class AbstractModule {
    protected String name;
    protected String description;
    protected float price;

    // added constructor do avoid WET
    public AbstractModule(
            String name,
            String description,
            float price
    ) {
        super();
        this.name = name;
        this.description = description;
        this.price = price;
    }

	public abstract String details();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
