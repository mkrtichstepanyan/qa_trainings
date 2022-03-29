package javaClasses.inheritance;

public abstract class Car {

    protected int horsepower;

    protected int originYear;

    protected String model;

    public  abstract void takeOff();

    public void accelerate(boolean accelerate) {
        if(accelerate) {
            System.out.println("Starting engine!");
            return;
        }
        System.out.println("Turning off the engine!");

    }

}
