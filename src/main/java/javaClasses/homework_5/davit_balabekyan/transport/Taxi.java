package javaClasses.homework_5.davit_balabekyan.transport;

import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Bookable;
import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Printer;
import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Stoppable;

import java.util.Objects;

public class Taxi implements Stoppable, Bookable, Printer {

    private String company;
    private String carBrand;
    private String driver;

    public Taxi(String company, String carBrand, String driver) {
        this.company = company;
        this.carBrand = carBrand;
        this.driver = driver;
    }

    public Taxi() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String bookTicket() {
        return "It was booked for taxi";
    }

    @Override
    public String printTransport() {
        return "This is taxi";
    }

    @Override
    public String makingStop() {
        return "Making stop for taxi";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxi taxi = (Taxi) o;
        return company.equals(taxi.company) && carBrand.equals(taxi.carBrand) && driver.equals(taxi.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, carBrand, driver);
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "company='" + company + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", driver='" + driver + '\'' +
                '}';
    }
}
