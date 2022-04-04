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
public class Railway implements Stoppable, Bookable, Printer {

    private String company;
    private int wagons;
    private String driver;
    private int horsePower;

    @Override
    public String bookTicket() {
        return "It was booked for railway";
    }

    @Override
    public String printTransport() {
        return "This is railway";
    }

    @Override
    public String makingStop() {
        return "Making stop for railway";
    }
}
