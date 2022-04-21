package designpatterns.homework_7.Lilit_Manukyan.builder;

public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int nbrOfDoors;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.engine = builder.engine;
        this.nbrOfDoors = builder.nbrOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", numberOfDoors=" + nbrOfDoors +
                '}';
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

    public String getEngine() {
        return engine;
    }

    public int getNbrOfDoors() {
        return nbrOfDoors;
    }

    public static Builder builder() {

        return new Builder();
    }

    public static class Builder {
        private String brand;
        private String model;
        private String color;
        private String engine;
        private int nbrOfDoors;

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

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder nbrOfDoors(int nbrOfDoors) {
            this.nbrOfDoors = nbrOfDoors;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
