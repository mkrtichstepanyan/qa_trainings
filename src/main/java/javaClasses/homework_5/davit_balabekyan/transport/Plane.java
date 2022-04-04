package javaClasses.homework_5.davit_balabekyan.transport;

import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Bookable;
import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Printer;

import java.util.Objects;

public class Plane implements Bookable, Printer {

    private String company;
    private String model;
    private String driver;
    private int horsePower;
    private int capacity;

    public Plane(String company, String model, String driver, int horsePower,int capacity) {
        this.company = company;
        this.model = model;
        this.driver = driver;
        this.horsePower = horsePower;
        this.capacity = capacity;
    }

    public Plane() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String bookTicket() {
        return "It was booked for plane";
    }

    @Override
    public String printTransport() {
        return "This is plane";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return horsePower == plane.horsePower && company.equals(plane.company) && model.equals(plane.model) && driver.equals(plane.driver) && capacity == plane.horsePower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, driver, horsePower, capacity);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", driver='" + driver + '\'' +
                ", horsePower=" + horsePower +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
