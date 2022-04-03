package javaClasses.homework_5.Heghine_Khachatryan.interface_part;

public class CruiseShip implements Bookable, Stoppable {
    private String transportName;

    public CruiseShip(String transportName) {
        this.transportName = transportName;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    @Override
    public String bookTicket() {
       return  "Ticked was booked for " + this.transportName;
    }
}
