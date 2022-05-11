package threads.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ExecutorThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        // TODO: Single executor
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        executor.submit(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//
//        executor.submit(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//
//        executor.submit(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//
//        executor.shutdown();


        // TODO: Multiple executor
//        ExecutorService executor1 = Executors.newFixedThreadPool(3);
//        executor1.submit(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//
//        executor1.submit(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//        executor1.submit(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//        executor1.submit(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//


        // TODO: Callable
//        Callable<String> task = () -> {
//            try {
//                TimeUnit.SECONDS.sleep(5);
//                return "After 5 seconds";
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                return null;
//            }
//        };
//
//        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        Future<String> future = executorService.submit(task);
//
//        System.out.println(future.isDone());
//        System.out.println(future.get(1, TimeUnit.SECONDS));
//
//
//        TimeUnit.SECONDS.sleep(6);
//        System.out.println(future.isDone());
//        System.out.println(future.get());


//        future.get(2,TimeUnit.SECONDS);
//        TimeUnit.SECONDS.sleep(6);
//        System.out.println(future.isDone());
//
        // TODO: InvokeAll
//        List<Callable<String>> tasks = Arrays.asList(
//                () -> {
//                    TimeUnit.SECONDS.sleep(2);
//                    return "Task 1";
//                },
//                () -> "Task 2",
//                () -> {
//                    TimeUnit.SECONDS.sleep(3);
//                    return "Task 3";
//                },
//                () -> "Task 4",
//                () -> "Task 5",
//                () -> "Task 6"
//        );
//
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        List<Future<String>> futures = executorService.invokeAll(tasks);
//
//        for (Future<String> future : futures) {
//            String s = future.get();
//            System.out.println(s);
//        }
//        executorService.shutdown();


        // TODO: InvokeAny
//        List<Callable<String>> tasks2 = Arrays.asList(
//                () -> {
//                    TimeUnit.SECONDS.sleep(2);
//                    System.out.println("1");
//                    return "Task 1";
//                },
//                () -> {
//                    TimeUnit.SECONDS.sleep(1);
//                    System.out.println("2");
//                    return "Task 2";
//                },
//                () -> {
//                    TimeUnit.SECONDS.sleep(1);
//                    System.out.println("3");
//                    return "Task 3";
//                }
//        );
//
//        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
//        String s = executorService1.invokeAny(tasks2);
//        System.out.println(s);
//        executorService1.shutdown();
//    }
    }
}