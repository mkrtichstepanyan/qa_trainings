package javaClasses.homework_5.Arevik_Arakelyan.Booking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Ferry implements Bookable, TransportPrinter, Stoppable {
    final String TYPE = "FERRY";
    private String model;
    private int id;

    @Override
    public String bookTicket() {
        return "Ferry";
    }

    @Override
    public String printTransport() {
        return this.TYPE;
    }
}
