package javaClasses.homework_5.anjela_melqonyan;

public class Test {
    public static void main(String [] args){
        Plane plane = new Plane("Plane");
        System.out.println(plane.makingStop());
        System.out.println(plane.bookTicket());
        Railway railway = new Railway("Railway","Anjela","Melqonyan");
        System.out.println(railway.bookTicket());
        System.out.println(railway.makingStop());
        Taxi taxi = new Taxi("Taxi","Shirakaci 104");
        System.out.println(taxi.bookTicket());
        System.out.println(taxi.makingStop());
        CruiseShip cruiseShip = new CruiseShip("CruiseShip");
        System.out.println(cruiseShip.bookTicket());
        Ferry ferry = new Ferry("Ferry");
        System.out.println(ferry.bookTicket());
        System.out.println(ferry.makingStop());

    }
}
