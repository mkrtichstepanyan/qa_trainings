package javaClasses.homework_5.davit_balabekyan.transport;

public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane("BOEING","737-900","Scott",1200,189);
        System.out.println(plane);
        System.out.println(plane.printTransport());
        System.out.println(plane.bookable.bookTicket());

        System.out.println("========================================================================");

        Taxi taxi = new Taxi("STAR", "bmw-m3", "Armen");
        System.out.println(taxi);
        System.out.println(taxi.printTransport());
        System.out.println(taxi.bookTicket());
        System.out.println(taxi.makingStop());

        System.out.println("========================================================================");

        Railway railway = new Railway("Indian",10,"Petros",800);
        System.out.println(railway);
        System.out.println(railway.printTransport());
        System.out.println(railway.bookTicket());
        System.out.println(railway.makingStop());

        System.out.println("========================================================================");

        CruiseShip cruiseShip = new CruiseShip("Norwegian","Dawn",6700);
        System.out.println(cruiseShip);
        System.out.println(cruiseShip.printTransport());
        System.out.println(cruiseShip.bookTicket());

        System.out.println("========================================================================");

        Ferry ferry = new Ferry("Volga","9",1400);
        System.out.println(ferry);
        System.out.println(ferry.printTransport());
        System.out.println(ferry.bookTicket());
    }
}
