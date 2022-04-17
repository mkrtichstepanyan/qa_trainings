package designpatterns.builder;

public class MainApp {

    public static void main(String[] args) {


        Car car = Car.builder()
                .brand("Lamborghini")
                .model("Huracan")
                .color("Black")
                .engine("8L")
                .height(1)
                .nbrOfDoors(2)
                .build();

        Car car2 = new Car.Builder()
                .brand("Lamborghini")
                .color("Black")
                .engine("4L")
                .build();

        String data = new StringBuilder("Temp")
                .append(1)
                .append(true)
                .append("friend")
                .toString();

        System.out.println(data);
    }

}
