package javaClasses.homework_5.anjela_melqonyan;

public class TransportManager {
    void showType(Transport transport){
        switch (transport){
            case AIR:
                System.out.println("Air transport types are Aeroplanes, Blimps, Helicopters...");
                break;
            case WATER:
                System.out.println("Water transport types are Ferry, Boat, Yacht, Ship ...");
                break;
            case GROUND:
                System.out.println("Ground transport types are Car, Bus, Van, Bicycle ...");
                break;
            default:
                System.out.println("No such transport type found");
        }
    }
    public static void main(String [] args){
        TransportManager transportManager = new TransportManager();
        transportManager.showType(Transport.WATER);
    }
}