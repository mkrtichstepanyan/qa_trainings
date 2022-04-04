package javaClasses.homework_5.anjela_melqonyan;

public class Taxi implements Bookable,Stoppable{
    private String transportName;
    private String addres;

    public Taxi(String transportName, String addres){
        this.transportName=transportName;
        this.addres=addres;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String bookTicket() {
        return "Your booking was made successfully"+" " + getTransportName();
    }

    @Override
    public String makingStop() {

        return Stoppable.super.makingStop()+" "+ getAddres();
    }
}