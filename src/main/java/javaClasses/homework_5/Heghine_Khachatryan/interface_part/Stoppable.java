package javaClasses.homework_5.Heghine_Khachatryan.interface_part;

public interface Stoppable {

    default String makingStop() {
        return "A stop is needed for the transport";
    }
}
