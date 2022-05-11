package threads.atomic;

public class Customer {

    private static volatile int idCounter = 0;
    public int id;
    boolean flag;

    public Customer() {

    }


}
