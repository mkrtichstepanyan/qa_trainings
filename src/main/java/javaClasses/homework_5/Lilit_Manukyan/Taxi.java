package javaClasses.homework_5.Lilit_Manukyan;

public class Taxi implements Bookable {

    public static String type = "taxi";
    private int originYear;
    private int horsePowerl;
    private int doors;
    private String color;

    public int getOriginYear() {
        return originYear;
    }

    public int getHorsePowerl() {
        return horsePowerl;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public void setOriginYear(int originYear) {
        this.originYear = originYear;
    }

    public void setHorsePowerl(int horsePowerl) {
        this.horsePowerl = horsePowerl;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void printTransport() {
        System.out.println("The transport type is " + type + ".");
    }

    @Override
    public String bookTicket() {
        return "It was booked for " + type;
    }

}
