package javaClasses.homework_5.Heghine_Khachatryan.interface_part;

public class Ferry implements Bookable, Stoppable {
    private String transportName;

    public Ferry(String transportName) {
        this.transportName = transportName;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String printTransport() {
        return "Transport type for ferry is " + this.transportName;
    }

    @Override
    public String bookTicket() {
        return "Ticked was booked for " + this.transportName;
    }
}
