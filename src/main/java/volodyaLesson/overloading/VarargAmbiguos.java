package volodyaLesson.overloading;

public class VarargAmbiguos {

    public static void enumeration(int... args) {
        System.out.println("Enumerating int");
        for (int item : args) {
            System.out.print(item + " ");
        }
    }

    public static void enumeration(String... args) {
        System.out.println("Enumerating strings, one param provided");
        for (String item : args) {
            System.out.println(item + " ");
        }
    }


//    public static void enumeration(String firstArg, String... args) {
//        System.out.println("Enumerating strings, two param provided");
//        System.out.println("First param is: " + firstArg);
//        for (String item : args) {
//            System.out.println(item + " ");
//        }
//    }


    public static void main(String[] args) {
        enumeration("Hello","asd","asd");
    }

//    public static void enumeration(double... args) {
//        System.out.println("Enumerating double varargs");
//        for (double item : args) {
//            System.out.println(item + " ");
//        }
//    }

}
