package javaClasses.homework_5.Booking;

import javaClasses.homework_5.Booking.Bookable;
import javaClasses.homework_5.Booking.TransportPrinter;
import lombok.*;

import java.util.Scanner;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Plane implements Bookable, TransportPrinter {
    final String TYPE = "PLANE";
    private String country;
    private String airport;
    private String planeModel;
    private int seat;

    @Override
    public String bookTicket() {
        Scanner console = new Scanner(System.in);
        System.out.println("write country");
        country = console.next();
        System.out.println("write airport");
        airport = console.next();
        System.out.println("write planeModel");
        planeModel = console.next();
        System.out.println("write seat");
        seat = console.nextInt();
        return "Thank you!" + " " + country + " " + airport + " " + planeModel + " " + TYPE + " is booked";
    }

    @Override
    public String printTransport() {
        return "This transport type is " + this.TYPE;
    }
}
