package javaClasses.homework_5.anjela_melqonyan;

public class Ferry  implements Bookable, Stoppable{
    private String transportName;

    public Ferry(String transportName){
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
        return "Booked for "+ getTransportName();
    }
}