package designpatterns.homework_7.anjela_melqonyan.builder;

public class Main {
    public static void main(String[] args){
        Car.Builder car = new Car.Builder()
                .id(12)
                .brand("BMV")
                .color("red")
                .engine("6l")
                .model("15 seria")
                .nbrOfDoor(4);
    }
}
