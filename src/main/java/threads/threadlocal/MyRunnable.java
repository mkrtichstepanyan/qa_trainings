package threads.threadlocal;

public class MyRunnable implements Runnable {

    private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();


    @Override
    public void run() {

        threadLocal.set((int) (Math.random() * 100D));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadLocal.get());
    }

}
