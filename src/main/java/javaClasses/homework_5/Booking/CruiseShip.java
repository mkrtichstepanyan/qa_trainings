package javaClasses.homework_5.Booking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class CruiseShip implements Bookable, TransportPrinter, Stoppable {
    final String TYPE = "CRUISESHIP";
    private String ship;
    private int shipFloor;
    private int roomNumber;

    @Override
    public String bookTicket() {
        Scanner console = new Scanner(System.in);
        System.out.println("write ship");
        ship = console.next();
        System.out.println("write shipFloor");
        shipFloor = console.nextInt();
        System.out.println("write roomNumber");
        roomNumber = console.nextInt();
        return "Thank you!" + " " + ship + " " + shipFloor + " " + roomNumber + " " + TYPE + " is booked";
    }

    @Override
    public String printTransport() {
        return "This transport type is " + this.TYPE;
    }
}