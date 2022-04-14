package javaClasses.homework_5.Booking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class Taxi implements Bookable, TransportPrinter {
    final String TYPE = "TAXI";
    private String city;
    private String street;
    private String carSize;

    @Override
    public String bookTicket() {
        return "Taxi";
    }

    @Override
    public String printTransport() {
        return this.TYPE;
    }
}
