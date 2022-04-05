package javaClasses.homework_5.davit_balabekyan.transport;

import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Bookable;
import javaClasses.homework_5.davit_balabekyan.transport.interfaces.Printer;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@SuppressWarnings("all")
public class Plane implements Printer {

    private String company;
    private String model;
    private String driver;
    private int horsePower;
    private int capacity;

    Bookable bookable = new Bookable() {
        @Override
        public String bookTicket() {
            return "It was booked for plane";
        }
    };

    public Plane(String company, String model, String driver, int horsePower, int capacity) {
        this.company = company;
        this.model = model;
        this.driver = driver;
        this.horsePower = horsePower;
        this.capacity = capacity;
    }

    @Override
    public String printTransport() {
        return "This is plane";
    }
}
