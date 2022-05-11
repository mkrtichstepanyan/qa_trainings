package threads.create;

import java.util.concurrent.TimeUnit;

public class CreateThread {

    public static void main(String[] args) throws InterruptedException {

        // TODO: Inheritance
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());

        // TODO: Inheritance
//        MyRunnable myRunnable = new MyRunnable();
//        new Thread(myRunnable).start();
//        System.out.println(Thread.currentThread().getName());


        // TODO: Functional Interface
//        Runnable task = () -> {
//            String name = Thread.currentThread().getName();
//            System.out.println(name);
//        };
//
//        Thread thread1 = new Thread(task);
//        thread1.start();
//        Thread thread2 = new Thread(task);
//        thread2.start();

    }
}
