package javaClasses.homework_5.Andranik_Sargsyan;

public interface Bookable {

    default String bookTicket() {
        return "transport was booked";
    }
}
