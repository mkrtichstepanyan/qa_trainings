package javaClasses.homework_5.Andranik_Sargsyan;

import java.util.Objects;

public class Ferry implements Bookable, Stoppable {

    private String truckNumber;
    private String cargoNumber;
    private double cargoWeightKG;
    private String departurePoint;
    private String placeArrival;

    public Ferry(String truckNumber, String cargoNumber, double cargoWeightKG, String departurePoint, String placeArrival) {
        this.truckNumber = truckNumber;
        this.cargoNumber = cargoNumber;
        this.cargoWeightKG = cargoWeightKG;
        this.departurePoint = departurePoint;
        this.placeArrival = placeArrival;
    }

    public String printTransport() {
        return String.valueOf(Transport.GROUND);
    }

    @Override
    public String bookTicket() {
        return "Truck number " + getTruckNumber() + " loaded cargo " + getCargoNumber() + " weight " +
                getCargoWeightKG() + "KG left the " + getDeparturePoint() + " in to " + getPlaceArrival();
    }

    @Override
    public String makingStop() {
        return "Truck number " + getTruckNumber() + " makes a stop in " + getDeparturePoint();
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber;
    }

    public String getCargoNumber() {
        return cargoNumber;
    }

    public void setCargoNumber(String cargoNumber) {
        this.cargoNumber = cargoNumber;
    }

    public double getCargoWeightKG() {
        return cargoWeightKG;
    }

    public void setCargoWeightKG(double cargoWeightKG) {
        this.cargoWeightKG = cargoWeightKG;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getPlaceArrival() {
        return placeArrival;
    }

    public void setPlaceArrival(String placeArrival) {
        this.placeArrival = placeArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ferry ferry = (Ferry) o;
        return Double.compare(ferry.cargoWeightKG, cargoWeightKG) == 0 && Objects.equals(truckNumber, ferry.truckNumber) && Objects.equals(cargoNumber, ferry.cargoNumber) && Objects.equals(departurePoint, ferry.departurePoint) && Objects.equals(placeArrival, ferry.placeArrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(truckNumber, cargoNumber, cargoWeightKG, departurePoint, placeArrival);
    }

    @Override
    public String toString() {
        return "Ferry{" +
                "truckNumber='" + truckNumber + '\'' +
                ", cargoNumber='" + cargoNumber + '\'' +
                ", cargoWeightKG=" + cargoWeightKG +
                ", departurePoint='" + departurePoint + '\'' +
                ", placeArrival='" + placeArrival + '\'' +
                '}';
    }
}
