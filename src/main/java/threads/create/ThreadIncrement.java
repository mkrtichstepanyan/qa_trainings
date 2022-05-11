package threads.create;

public class ThreadIncrement {
    volatile int i = 0;

    void inc() {
        i++;
    }

    void dec() {
        i--;
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadIncrement threadIncrement = new ThreadIncrement();
        Thread thread1 = new Thread(() -> {
            for (int j = 0; j < 100000; j++) {
                threadIncrement.inc();
            }
            System.out.println("T1 - finished");
        });
        Thread thread2 = new Thread(() -> {
            for (int j = 0; j < 100000; j++) {
                threadIncrement.dec();
            }
            System.out.println("T2 - finished");
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(threadIncrement.i);
    }


}
