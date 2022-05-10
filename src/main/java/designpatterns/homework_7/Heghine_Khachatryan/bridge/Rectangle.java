package designpatterns.homework_7.Heghine_Khachatryan.bridge;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void fillShape() {
        System.out.print("Rectangle is ");
        color.fillColor();
    }
}
