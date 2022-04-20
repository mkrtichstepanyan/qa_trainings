package designpatterns.homework_7.AndSargsyan.builder;

public class Car {

    private final int winCode;
    private final int weight;
    private final String model;
    private final String color;
    private final String engine;


    private Car(Builder builder) {
        this.winCode = builder.winCode;
        this.weight = builder.weight;
        this.model = builder.model;
        this.color = builder.color;
        this.engine = builder.engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "winCode=" + winCode +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public int getWinCode() {
        return winCode;
    }

    public int getWeight() {
        return weight;
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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int winCode;
        private int weight;
        private String model;
        private String color;
        private String engine;

        public Builder winCode(int winCode) {
            this.winCode = winCode;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
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

        public Car build() {
            return new Car(this);
        }
    }
}