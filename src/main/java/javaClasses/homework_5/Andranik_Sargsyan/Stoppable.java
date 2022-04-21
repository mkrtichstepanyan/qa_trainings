package javaClasses.homework_5.Andranik_Sargsyan;

public interface Stoppable {

    default String makingStop() {
        return "transport out of traffic!";
    }
}
