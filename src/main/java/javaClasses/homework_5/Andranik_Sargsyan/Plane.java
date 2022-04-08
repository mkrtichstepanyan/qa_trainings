package javaClasses.homework_5.Andranik_Sargsyan;

import java.util.Objects;

public class Plane implements Bookable {

    private String name;
    private String model;
    private String departurePoint;
    private String placeArrival;
    private User user;

    public Plane(String name, String model, String departurePoint, String placeArrival, User user) {
        this.name = name;
        this.model = model;
        this.departurePoint = departurePoint;
        this.placeArrival = placeArrival;
        this.user = user;
    }

    @Override
    public String bookTicket() {
        return "flight ticket booked " + getPlaceArrival() + " " + getDeparturePoint() + " ticket Name: " +
                getName() + " " + getModel() + " for a comrade " + getUser();
    }

    public String printTransport() {
        return String.valueOf(Transport.AIR);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(name, plane.name) && Objects.equals(model, plane.model) && Objects.equals(departurePoint, plane.departurePoint) && Objects.equals(placeArrival, plane.placeArrival) && Objects.equals(user, plane.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, departurePoint, placeArrival, user);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", departurePoint='" + departurePoint + '\'' +
                ", placeArrival='" + placeArrival + '\'' +
                ", user=" + user +
                '}';
    }
}
