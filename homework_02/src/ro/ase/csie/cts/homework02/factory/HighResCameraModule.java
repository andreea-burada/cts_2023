package ro.ase.csie.cts.homework02.factory;

public class HighResCameraModule extends AbstractModule{
    protected int resolution;
    protected boolean hasFlash;
    public HighResCameraModule(
            String name,
            String description,
            float price
    ) {
        super(name, description, price);
    }

    public HighResCameraModule(
            String name,
            String description,
            float price,
            int resolution,
            boolean hasFlash
    ) {
        super(name, description, price);
        this.resolution = resolution;
        this.hasFlash = hasFlash;
    }

    @Override
    public String details() {
        return String.format("High Resolution Camera module: name - %s; description - %s; price - $%.2f; resolution - %sMP; has flash - %b",
                this.name,
                this.description,
                this.price,
                this.resolution,
                this.hasFlash
        );
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isHasFlash() {
        return hasFlash;
    }

    public void setHasFlash(boolean hasFlash) {
        this.hasFlash = hasFlash;
    }
}
