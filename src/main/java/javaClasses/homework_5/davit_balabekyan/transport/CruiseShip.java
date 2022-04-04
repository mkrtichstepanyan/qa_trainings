package javaClasses.homework_5.davit_balabekyan.transport;

import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Bookable;
import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Printer;

import java.util.Objects;

public class CruiseShip implements Bookable, Printer {

    private String company;
    private String model;
    private int capacity;

    public CruiseShip(String company, String model, int capacity) {
        this.company = company;
        this.model = model;
        this.capacity = capacity;
    }

    public CruiseShip() {
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String bookTicket() {
        return "It was booked for cruise ship";
    }

    @Override
    public String printTransport() {
        return "This is cruise ship";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CruiseShip that = (CruiseShip) o;
        return capacity == that.capacity && company.equals(that.company) && model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, capacity);
    }

    @Override
    public String toString() {
        return "CruiseShip{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
