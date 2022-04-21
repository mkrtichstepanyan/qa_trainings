package javaClasses.homework_5.Heghine_Khachatryan.interface_part;

public class Plain implements Bookable, Stoppable {
    private String transportName;

    public Plain (String transportName) {
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
        return "For the day you choose there is no available tickets for " + getTransportName() +
                ". Please choose another day.";
    }
}
