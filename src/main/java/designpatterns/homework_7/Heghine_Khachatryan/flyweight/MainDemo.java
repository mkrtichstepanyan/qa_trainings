package designpatterns.homework_7.Heghine_Khachatryan.flyweight;

public class MainDemo {
     private final static String [] colors = {"blue", "red", "green", "yellow", "orange", "black", "white"};

     private static String getRandomColors () {
        return colors[(int) (Math.random()* colors.length)];
     }

    private static int getRandomHeight() {
         return (int) (Math.random()*1000);
    }

    private static int getRandomWeight() {
        return (int) (Math.random()*1000);
    }

    private static int getRandomRadius() {
        return (int) (Math.random()*1000);
    }

    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();
        for (int i = 0; i < 10; i++) {
        Circle circle = (Circle) CircleFactory.drawShape(getRandomColors());
            circle.setHeight(getRandomHeight());
            circle.setWeight(getRandomWeight());
            circle.setRadius(getRandomRadius());
            circle.createShape();
        }
    }
}
