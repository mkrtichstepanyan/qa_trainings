package designpatterns.homework_7.davit_balabekyan.builder;

public class Main {
    public static void main(String[] args) {
        Car car = Car.builder()
                .id(1)
                .height(2000)
                .brand("BMW")
                .model("5 seria")
                .color("White")
                .engine("5.0")
                .nbrOfDoors(2)
                .build();

        System.out.println(car);
    }
}
