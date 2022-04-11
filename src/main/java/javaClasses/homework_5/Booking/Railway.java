package javaClasses.homework_5.Booking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Railway implements Bookable, Stoppable, TransportPrinter {
    final String TYPE = "RAILWAY";
    private String city;
    private String station;
    private int wagonNumber;
    private int seat;

    @Override
    public String bookTicket() {
        Scanner console = new Scanner(System.in);
        System.out.println("write city");
        city = console.next();
        System.out.println("write station");
        station = console.next();
        System.out.println("write wagonNumber");
        wagonNumber = console.nextInt();
        System.out.println("write seat");
        seat = console.nextInt();

        return "Thank you!" + " " + city + " " + station + " " + wagonNumber + " " + TYPE + " is booked";
    }

    @Override
    public String makingStop() {
        return Stoppable.super.makingStop();
    }

    @Override
    public String printTransport() {
        return this.TYPE;
    }

}
