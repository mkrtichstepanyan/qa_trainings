package javaClasses.homework_5.Andranik_Sargsyan;

import java.util.Locale;

public class TransportOrder {

    public static void main(String[] args) {

        //Taxi
        Taxi taxi = new Taxi("35cc142", "Aladin", "+374123456",
                "+374555555", "Yerevanyan street");
        System.out.println(taxi.printTransport() + "\n" + taxi + "\n" + taxi.bookTicket() + "\n" + taxi.makingStop());

        //Railway
        Railway railway = new Railway("express", "Gyumri", "Yereven", "Poxos");
        System.out.println(railway.printTransport() + "\n" + railway.bookTicket() + "\n" + railway.makingStop());

        //Plane
        Plane plane = new Plane("BN218", "Boing", "Gyumri", "Moscow",
                new User("And", "Sargsyan", "+374121212"));
        System.out.println(plane.printTransport() + "\n" + plane.bookTicket().toUpperCase(Locale.ROOT));

        //Ferry
        Ferry ferry = new Ferry("PX4551", "UN121447",
                787.455, "Poti", "Erevan");
        System.out.println(ferry.printTransport() + "\n" + ferry + "\n" +
                ferry.bookTicket() + "\n" + ferry.makingStop());

        //CruiseShip
        CruiseShip cruiseShip = new CruiseShip.CruiseShipBuilder()
                .nameShip("Odyssey")
                .numberShip("WQ777")
                .fullWeight("78784KG")
                .peopleCapacity("558 Person")
                .portArrival("Sharm Al Sheich")
                .portDeparture("Emirates")
                .travelTime("23 hours")
                .user(new User("And", "Sargsyan", "+37787887"))
                .build();
        System.out.println(cruiseShip.printTransport() + "\n" + cruiseShip.bookTicket());

    }
}
