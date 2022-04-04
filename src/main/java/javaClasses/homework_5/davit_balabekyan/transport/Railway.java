package javaClasses.homework_5.davit_balabekyan.transport;

import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Bookable;
import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Printer;
import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Stoppable;

import java.util.Objects;

public class Railway implements Stoppable, Bookable, Printer {

    private String company;
    private int wagons;
    private String driver;
    private int horsePower;

    public Railway(String company, int wagons, String driver, int horsePower) {
        this.company = company;
        this.wagons = wagons;
        this.driver = driver;
        this.horsePower = horsePower;
    }

    public Railway() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
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

    @Override
    public String bookTicket() {
        return "It was booked for railway";
    }

    @Override
    public String printTransport() {
        return "This is railway";
    }

    @Override
    public String makingStop() {
        return "Making stop for railway";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Railway railway = (Railway) o;
        return wagons == railway.wagons && horsePower == railway.horsePower && company.equals(railway.company) && driver.equals(railway.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, wagons, driver, horsePower);
    }

    @Override
    public String toString() {
        return "Railway{" +
                "company='" + company + '\'' +
                ", wagons=" + wagons +
                ", driver='" + driver + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
