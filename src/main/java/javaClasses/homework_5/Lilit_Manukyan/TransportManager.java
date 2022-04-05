package javaClasses.homework_5.Lilit_Manukyan;

public class TransportManager {

    public Transport transport;

    public void showType(Transport transport) {
        switch (transport) {
            case WATER:
                System.out.println(Transport.WATER + "- Available transport types are CruiseShip and Ferry");
                break;
            case AIR:
                System.out.println(Transport.AIR + "- Available transport type is a Plane");
                break;
            case GROUND:
                System.out.println(Transport.GROUND + "- Available transport types are Railway and Taxi");
                break;
            default:
                System.out.println("None of these types of transport exist");
        }
    }

}
