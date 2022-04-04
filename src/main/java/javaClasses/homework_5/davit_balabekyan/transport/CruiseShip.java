package javaClasses.homework_5.davit_balabekyan.transport;

import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Bookable;
import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Printer;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CruiseShip implements Bookable, Printer {

    private String company;
    private String model;
    private int capacity;

    @Override
    public String bookTicket() {
        return "It was booked for cruise ship";
    }

    @Override
    public String printTransport() {
        return "This is cruise ship";
    }
}
