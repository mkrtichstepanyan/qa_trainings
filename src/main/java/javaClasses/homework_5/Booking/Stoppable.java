package javaClasses.homework_5.Booking;


public interface Stoppable {

    default String makingStop() {
        return "This type of transport can not stop";
    }
}
