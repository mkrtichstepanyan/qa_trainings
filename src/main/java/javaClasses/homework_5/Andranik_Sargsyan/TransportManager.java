package javaClasses.homework_5.Andranik_Sargsyan;

public class TransportManager {

    public static void main(String[] args) {

        TransportManager transportManager = new TransportManager();
        transportManager.showType(Transport.AIR);
    }

    void showType(Transport transport) {
        switch (transport) {
            case AIR:
                System.out.println("Air transport is: Airplane, Airship, Drone ");
                break;
            case WATER:
                System.out.println("Water transport is: Boat, Canoe, Submarine");
                break;
            case GROUND:
                System.out.println("Ground transport is: Car, Truck, Train ");
                break;
            default:
                System.out.println("Set a name, not name");
        }
    }
}
