package javaClasses.homework_5.Booking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class Taxi implements Bookable, Stoppable, TransportPrinter {
    final String TYPE = "TAXI";
    private String city;
    private String street;
    private String carSize;
    private String stopStreet;
    private int stopTime;

    @Override
    public String bookTicket() {
        return "Taxi";
    }

    @Override
    public String makingStop() {
        return stopStreet + " " + "street" + " " + stopTime + " " + "minute";
    }

    @Override
    public String printTransport() {
        return this.TYPE;
    }
}
