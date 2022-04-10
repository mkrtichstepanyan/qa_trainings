package javaClasses.homework_5.Lilit_Manukyan;

public class Railway implements Bookable {

    private String model;
    private int originYear;
    private int numberOfWagons;
    public static String type = "railWay";

    public String getModel() {
        return model;
    }

    public int getOriginYear() {
        return originYear;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOriginYear(int originYear) {
        this.originYear = originYear;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public static void printTransport() {
        System.out.println("The transport type is " + type + ".");
    }

    @Override
    public String bookTicket() {
        return "It was booked for " + type;
    }

}
