package javaClasses.homework_5.anjela_melqonyan;

public class Railway implements Bookable,Stoppable{
    private String transportName;
    private String name;
    private String surname;

    public Railway(String transportName, String name, String surname) {
        this.transportName = transportName;
        this.name = name;
        this.surname = surname;
    }

    public String getTransportName() {
        return transportName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String makingStop() {
        return "Need a stop in every city "+ getTransportName();
    }

    @Override
    public String bookTicket() {
        return "Ticket for "+getName()+ " "+ getSurname()+ " is booked"+
                "for Saturday at 13.00 PM. The riding on  "+getTransportName();
    }
}