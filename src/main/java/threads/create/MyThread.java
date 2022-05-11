package threads.create;

public class MyThread extends Thread {
    static int i = 0;

    @Override
    public void run() {
        i++;
    }
}
