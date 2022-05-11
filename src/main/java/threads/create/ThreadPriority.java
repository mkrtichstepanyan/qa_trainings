package threads.create;

import java.util.concurrent.TimeUnit;

public class ThreadPriority {

    public static void main(String[] args) {
        // TODO: Thread Priority
        Runnable task1 = () -> {
            print(1);
        };
        Runnable task2 = () -> {
            print(1);
        };
        Thread low = new Thread(task1);
        Thread high = new Thread(task2);
        low.setPriority(1);
        high.setPriority(10);

        low.start();
        high.start();

    }


    public static void print(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("Inside print method");
    }

}
