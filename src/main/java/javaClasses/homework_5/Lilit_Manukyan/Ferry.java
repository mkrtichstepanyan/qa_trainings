package javaClasses.homework_5.Lilit_Manukyan;

public class Ferry implements Bookable {

    private String model;
    private int originYear;
    private long weight;
    public static String type = "ferry";

    public String getModel() {
        return model;
    }

    public int getOriginYear() {
        return originYear;
    }

    public long getWeight() {
        return weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOriginYear(int originYear) {
        this.originYear = originYear;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public static void printTransport() {
        System.out.println("The transport type is " + type + ".");
    }

    @Override
    public String bookTicket() {
        return "It was booked for " + type;
    }

}
