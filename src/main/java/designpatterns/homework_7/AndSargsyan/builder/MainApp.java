package designpatterns.homework_7.AndSargsyan.builder;

public class MainApp {
    public static void main(String[] args) {

        Car car = Car.builder()
                .color("Black")
                .weight(1556)
                .winCode(1545656566)
                .engine("2.2l")
                .model("Opel")
                .build();

        System.out.println(car);
    }
}
