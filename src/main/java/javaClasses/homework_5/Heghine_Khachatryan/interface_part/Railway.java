package javaClasses.homework_5.Heghine_Khachatryan.interface_part;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Railway implements Bookable, Stoppable {
    private String transportName;
    private String name;
    private String surname;
    private String passport;

    public Railway(String transportName, String name, String surname, String passport) {
        this.transportName = transportName;
        this.name = name;
        this.surname = surname;
        this.passport = passport;
    }

    @Override
    public String bookTicket() {
        String regex = "[A-Z]{2}[0-9]{7}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(getPassport());
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Passport number doesn't match. Please check again");
        } else {
            return "Ticket for " + getName() + " " + getSurname() + " passport (" + getPassport() + ") is booked" +
                    " for Monday 04, 2022.The riding on " + getTransportName() + " will take place at 14:00 PM.";
        }
    }

    @Override
    public String makingStop() {
        return "A stop is needed every 45 minutes according to the transport (" + getTransportName() + ") scheduler.";
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
