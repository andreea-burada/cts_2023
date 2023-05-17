package subject_B6.prototype.models;

import subject_B6.IComponent;

public class Sticker implements ISticker {
    private float width;
    private float height;
    private String color;
    public Sticker(IComponent component) {
        this.width = component.getComponentWidth();
        this.height = component.getComponentHeight();
        this.color = "not " + component.getComponentColor();
    }

    @Override
    public ISticker copy() throws CloneNotSupportedException {
        return (ISticker) this.clone();
    }

    @Override
    public String details() {
        return "Sticker{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
