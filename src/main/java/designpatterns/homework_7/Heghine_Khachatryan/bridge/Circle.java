package designpatterns.homework_7.Heghine_Khachatryan.bridge;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    void fillShape() {
        System.out.print("Circle is ");
        color.fillColor();
    }
}
