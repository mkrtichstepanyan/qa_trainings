package javaClasses.homework_5.Lilit_Manukyan;

public class Main {
    public static void main(String[] args) {

        Ferry ferry = new Ferry();
        CruiseShip cruiseShip = new CruiseShip();
        Railway railway = new Railway();
        Taxi taxi = new Taxi();
        Plane plane = new Plane();
        Ferry.printTransport();
        System.out.println(ferry.bookTicket());
        CruiseShip.printTransport();
        System.out.println(cruiseShip.bookTicket());
        Railway.printTransport();
        System.out.println(railway.bookTicket());
        Taxi.printTransport();
        System.out.println(taxi.bookTicket());
        Plane.printTransport();
        System.out.println(plane.bookTicket());
        Transport transport = Transport.GROUND;
        TransportManager transportManager = new TransportManager();
        transportManager.showType(transport);

    }
}
