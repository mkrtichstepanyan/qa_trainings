package javaClasses.homework_5.Andranik_Sargsyan;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CruiseShip implements Bookable {

    private String nameShip;
    private String numberShip;
    private String fullWeight;
    private String peopleCapacity;
    private String travelTime;
    private String portDeparture;
    private String portArrival;
    private User user;


    @Override
    public String bookTicket() {
        return "Cruise ship " + getNameShip() + getNumberShip() + " weight " + getFullWeight() +
                " capacity " + getPeopleCapacity() + " departure from the port " + "\n" +
                getPortDeparture() + " travel time " + getTravelTime() + " arrival at the port " + getPortArrival() +
                " book ticket for " + getUser();
    }

    public String printTransport() {
        return String.valueOf(Transport.WATER);
    }
}
