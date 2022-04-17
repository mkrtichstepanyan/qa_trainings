package javaClasses.homework_5.Andranik_Sargsyan;

import java.util.Objects;

public class Railway implements Bookable, Stoppable {

    private String trainName;
    private String exitPoint;
    private String pointArrival;
    private String passengerName;

    public Railway(String trainName, String exitPoint, String pointArrival, String passengerName) {
        this.trainName = trainName;
        this.exitPoint = exitPoint;
        this.pointArrival = pointArrival;
        this.passengerName = passengerName;
    }

    @Override
    public String bookTicket() {
        return "flight ticket booked " + getExitPoint() + " " + getPointArrival() +
                " " + getTrainName() + " for name " + getPassengerName();
    }

    @Override
    public String makingStop() {
        return "the train is at the station " + getExitPoint();
    }

    public String printTransport() {
        return String.valueOf(Transport.GROUND);
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getExitPoint() {
        return exitPoint;
    }

    public void setExitPoint(String exitPoint) {
        this.exitPoint = exitPoint;
    }

    public String getPointArrival() {
        return pointArrival;
    }

    public void setPointArrival(String pointArrival) {
        this.pointArrival = pointArrival;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Railway railway = (Railway) o;
        return Objects.equals(trainName, railway.trainName) && Objects.equals(exitPoint, railway.exitPoint) && Objects.equals(pointArrival, railway.pointArrival) && Objects.equals(passengerName, railway.passengerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainName, exitPoint, pointArrival, passengerName);
    }

    @Override
    public String toString() {
        return "Railway{" +
                "trainName='" + trainName + '\'' +
                ", exitPoint='" + exitPoint + '\'' +
                ", pointArrival='" + pointArrival + '\'' +
                ", passengerName='" + passengerName + '\'' +
                '}';
    }
}
