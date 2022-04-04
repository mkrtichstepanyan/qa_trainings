package javaClasses.homework_5.davit_balabekyan.enum_transport;

public class TransportManager {

    void showType(Transport transport) {
        switch (transport) {
            case AIR:
                System.out.println("Air transport is plane");
                break;
            case GROUND:
                System.out.println("Ground transports are taxi and railway");
                break;
            case WATER:
                System.out.println("Water transport are cruise ship and ferry");
                break;
            default:
                System.out.println("not found matches transport");
        }
    }
}
