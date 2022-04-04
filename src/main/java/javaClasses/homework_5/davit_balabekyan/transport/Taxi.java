package javaClasses.homework_5.davit_balabekyan.transport;

import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Bookable;
import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Printer;
import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Stoppable;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Taxi implements Stoppable, Bookable, Printer {

    private String company;
    private String carBrand;
    private String driver;

    @Override
    public String bookTicket() {
        return "It was booked for taxi";
    }

    @Override
    public String printTransport() {
        return "This is taxi";
    }

    @Override
    public String makingStop() {
        return "Making stop for taxi";
    }
}
