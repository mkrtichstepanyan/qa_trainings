package javaClasses.homework_5.Arevik_Arakelyan.Transport;

public class TransportManager {

    void showType(Transport transport){
        switch (transport){
            case AIR:
                System.out.println("Planess, helicopters, ropeways are Air transport");
                break;
            case GROUND:
                System.out.println("Cars, bycicles, taxies, railways are Ground transport");
                break;
            case WATER:
                System.out.println("Ferries, ships, boats are Water transport");
                break;
            default:
                System.out.println("No Transport");
        }
    }
    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();
        transportManager.showType(Transport.AIR);
        transportManager.showType(Transport.GROUND);
        transportManager.showType(Transport.WATER);
    }
}
