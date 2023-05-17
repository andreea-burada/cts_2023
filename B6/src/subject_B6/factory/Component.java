package subject_B6.factory;

import subject_B6.IComponent;

public class Component implements IComponent {
    private String color;
    private float width;
    private float height;

    public Component(String color, float width, float height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getComponentColor() {
        return this.color;
    }

    @Override
    public float getComponentWidth() {
        return this.width;
    }

    @Override
    public float getComponentHeight() {
        return this.height;
    }
}
