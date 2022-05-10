package designpatterns.homework_7.anjela_melqonyan.builder;

public class Car {
    private final int id;
    private final String brand;
    private final  String model;
    private final String color;
    private final int nbrOfDoor;
    private final String engine;


    public Car(int id, String brand, String model, String color, int nbrOfDoor, String engine) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.nbrOfDoor = nbrOfDoor;
        this.engine = engine;
    }


    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getNbrOfDoor() {
        return nbrOfDoor;
    }

    public String getEngine() {
        return engine;
    }

    public static class Builder {
        private int id;
        private String brand;
        private String model;
        private String color;
        private int nbrOfDoor;
        private String engine;


        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder nbrOfDoor(int  nbrOfDoor) {
            this.nbrOfDoor = nbrOfDoor;
            return this;
        }

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

    }
}
