package javaClasses.homework_5.Lilit_Manukyan;

public class Plane implements Bookable {

    public static String type = "plane";
    private int originYear;
    private String engine;

    public int getOriginYear() {
        return originYear;
    }

    public String getEngine() {
        return engine;
    }

    public void setOriginYear(int originYear) {
        this.originYear = originYear;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static void printTransport() {
        System.out.println("The transport type is " + type);
    }

    @Override
    public String bookTicket() {
        return "It was booked for " + type;
    }

}
