package designpatterns.homework_7.Heghine_Khachatryan.flyweight;

import java.util.HashMap;

public class CircleFactory {
    private static final HashMap<String, Shape> circleCreator = new HashMap<>();

    public static Shape drawShape (String color) {
        Circle circle = (Circle) circleCreator.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleCreator.put(color,circle);
            System.out.println("Creating a circle, color - " + color);
        }
        return circle;
    }

}
