package javaClasses.homework_5.Heghine_Khachatryan.enums;

public class TransportManager {

    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();
        transportManager.showType(Transport.AIR);
    }

    void showType(Transport transport) {
        switch (transport) {
            case AIR:
                System.out.println("Air transport types are: Aeroplanes, Helicopters, Blimps and so on...");
                break;
            case WATER:
                System.out.println("Water transport types are: Boat, Yacht, Ship, Raft, Ferry and so on...");
                break;
            case GROUND:
                System.out.println("Ground transport types are: Car, Bus, Bicycle, Train, Van and so on...");
                break;
            default:
                System.out.println("To identify that type of transport we need some time...");
        }
    }
}
