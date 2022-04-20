package designpatterns.homework_7.Heghine_Khachatryan.bridge;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void fillShape();
}
