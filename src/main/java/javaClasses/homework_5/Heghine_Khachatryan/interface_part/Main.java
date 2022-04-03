package javaClasses.homework_5.Heghine_Khachatryan.interface_part;

public class Main {
    public static void main(String[] args) {
//        Railway railway = new Railway("Railway","Heghine","Khachatryan","AS0350406");
//        System.out.println(railway.bookTicket());
//        System.out.println(railway.makingStop());

//        Taxi taxi = new Taxi("Taxi",
//                new Taxi.Address(46, "S. Matnishyan Street", "Gyumri", "Shirak"));
//        System.out.println(taxi.bookTicket());
//        System.out.println(taxi.makingStop());

        System.out.println(new Plain("Plain").bookTicket());

        System.out.println(new CruiseShip("Ocean Cruise Ship.").bookTicket());

        System.out.println(new Ferry("Catamaran").bookTicket());
    }
}
