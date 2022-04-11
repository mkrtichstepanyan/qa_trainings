package javaClasses.homework_5.Arevik_Arakelyan.Booking;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("Gyumri", "Ndjdeh", "large", "P. Sevak", 5);
        Ferry ferry = new Ferry("Modern", 1568);
        Plane plane = new Plane("Russia", "Domodedovo", "Boing", 50);
        CruiseShip cruiseShip = new CruiseShip("Dream", 3, 155);
        Railway railway = new Railway("Yerevan", "Number1", 2, 50);
        System.out.println(plane);
        //System.out.println(plane.bookTicket().toUpperCase(Locale.ROOT));
        System.out.println(taxi);
        //System.out.println(taxi.makingStop());
        //System.out.println(taxi.bookTicket().toUpperCase(Locale.ROOT));
        System.out.println(cruiseShip);
        //System.out.println(cruiseShip.bookTicket().toUpperCase(Locale.ROOT));
        System.out.println(railway);
        //System.out.println(railway.bookTicket().toUpperCase(Locale.ROOT));
        System.out.println(ferry);
        //System.out.println(ferry.bookTicket().toUpperCase(Locale.ROOT));
    }
}
