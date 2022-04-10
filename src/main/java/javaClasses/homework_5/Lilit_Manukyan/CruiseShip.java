package javaClasses.homework_5.Lilit_Manukyan;

public class CruiseShip implements Bookable {

    public static String type = "cruiseShip";
    private String model;
    private int originYear;
    private int horsePower;

    public String getModel() {
        return model;
    }

    public int getOriginYear() {
        return originYear;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOriginYear(int originYear) {
        this.originYear = originYear;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public static void printTransport() {
        System.out.println("The transport type is " + type + ".");
    }

    @Override
    public String bookTicket() {
        return "It was booked for " + type;
    }

}
