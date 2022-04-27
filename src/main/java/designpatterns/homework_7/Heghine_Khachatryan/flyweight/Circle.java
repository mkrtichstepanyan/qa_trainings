package designpatterns.homework_7.Heghine_Khachatryan.flyweight;

public class Circle implements Shape{
    private final String color;
    private int radius;
    private int height;
    private int weight;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void createShape() {
        System.out.println("Creating " + getColor() + " circle with height " + getHeight() + " width: "
                + getWeight() +" and radius " + getRadius());
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
