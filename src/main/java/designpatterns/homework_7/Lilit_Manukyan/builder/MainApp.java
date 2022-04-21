package designpatterns.homework_7.Lilit_Manukyan.builder;


public class MainApp {
    public static void main(String[] args) {
        Car car1 = Car.builder()
                .brand("Lamborghini")
                .model("Huracan")
                .color("Black")
                .engine("8L")
                .nbrOfDoors(2)
                .build();

        Car car2 = Car.builder()
                .brand("Lamborghini")
                .color("Black")
                .engine("4L")
                .build();
    }
}
