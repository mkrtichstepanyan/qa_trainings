package javaClasses.homework_5.Andranik_Sargsyan;

import java.util.Objects;

public class Taxi implements Bookable, Stoppable {

    private String number;
    private String nameTaxi;
    private String phoneNumberDriver;
    private String costumerNumber;
    private String destination;

    public Taxi(String number, String nameTaxi, String phoneNumberDriver, String costumerNumber, String destination) {
        this.number = number;
        this.nameTaxi = nameTaxi;
        this.phoneNumberDriver = phoneNumberDriver;
        this.costumerNumber = costumerNumber;
        this.destination = destination;
    }

    public String printTransport() {
        return String.valueOf(Transport.GROUND);
    }

    public Taxi() {
        System.out.println("Please inout params!");
    }

    @Override
    public String bookTicket() {
        return getNameTaxi() + " " + getNumber() + " " + getPhoneNumberDriver() + " Taxi was booked for "
                + getCostumerNumber() + " " + getDestination();
    }

    @Override
    public String makingStop() {
        return "Taxi " + getNameTaxi() + " out of traffic at the address! " + getDestination();
    }

    public String getCostumerNumber() {
        return costumerNumber;
    }

    public void setCostumerNumber(String costumerNumber) {
        this.costumerNumber = costumerNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNameTaxi() {
        return nameTaxi;
    }

    public void setNameTaxi(String nameTaxi) {
        this.nameTaxi = nameTaxi;
    }

    public String getPhoneNumberDriver() {
        return phoneNumberDriver;
    }

    public void setPhoneNumberDriver(String phoneNumberDriver) {
        this.phoneNumberDriver = phoneNumberDriver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxi taxi = (Taxi) o;
        return Objects.equals(number, taxi.number) && Objects.equals(nameTaxi, taxi.nameTaxi) && Objects.equals(phoneNumberDriver, taxi.phoneNumberDriver) && Objects.equals(costumerNumber, taxi.costumerNumber) && Objects.equals(destination, taxi.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, nameTaxi, phoneNumberDriver, costumerNumber, destination);
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "number='" + number + '\'' +
                ", nameTaxi='" + nameTaxi + '\'' +
                ", phoneNumberDriver='" + phoneNumberDriver + '\'' +
                ", costumerNumber='" + costumerNumber + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
