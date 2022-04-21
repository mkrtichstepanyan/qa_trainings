package javaClasses.homework_5.anjela_melqonyan;

public class Plane implements Bookable, Stoppable{
    private String transportName;

    public Plane(String transportName){

        this.transportName= transportName;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }


    @Override
    public String bookTicket() {
        return "No ticket this week for " + getTransportName() +
                " Please choose another day.";
    }

}