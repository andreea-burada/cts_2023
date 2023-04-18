package ro.ase.csie.cts.homework02.factory;

public class GpsTrackingModule extends AbstractModule {
    protected int maxRange;
    protected float accuracy;

    public GpsTrackingModule(
            String name,
            String description,
            float price
    ) {
        super(name, description, price);
    }

    public GpsTrackingModule(
            String name,
            String description,
            float price,
            int maxRange,
            float accuracy
    ) {
        super(name, description, price);
        this.maxRange = maxRange;
        this.accuracy = accuracy;
    }

    @Override
    public String details() {
        return String.format("GPS Tracking module: name - %s; description - %s; price - $%.2f; max. range - %sm; accuracy - %.2f%%",
                this.name,
                this.description,
                this.price,
                this.maxRange,
                this.accuracy
        );
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }
}
