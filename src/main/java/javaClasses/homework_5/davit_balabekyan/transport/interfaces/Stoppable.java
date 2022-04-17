package javaClasses.homework_5.davit_balabekyan.transport.interfaces;

public interface Stoppable {

    default String makingStop() {
        return "making stop for ground type of transport";
    }
}
