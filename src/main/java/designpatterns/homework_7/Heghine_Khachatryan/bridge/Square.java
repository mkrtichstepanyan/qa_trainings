package designpatterns.homework_7.Heghine_Khachatryan.bridge;

public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    void fillShape() {
        System.out.print("Square is ");
        color.fillColor();
    }


}
