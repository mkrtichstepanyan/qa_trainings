package designpatterns.homework_7.Heghine_Khachatryan.bridge;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new BlueColor());
        rectangle.fillShape();

        Shape circle = new Circle(new RedColor());
        circle.fillShape();

        Shape square = new Square(new GreenColor());
        square.fillShape();
    }
}
