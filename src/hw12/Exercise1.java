package hw12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Exercise1 {
    private static final Object monitor = new Object();
    private static final ExecutorService service = Executors.newFixedThreadPool(1);
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long counter = 0;
        long startTime = System.nanoTime();
        FutureTask<String> task = new FutureTask<String>(() -> "5 seconds have passed");
        while(true){
            Thread.sleep(1000);
            counter++;
            System.out.println((System.nanoTime()-startTime)/10000000);
//            System.out.println(counter);
            if (counter%5 == 0){
                service.execute(task);
                System.out.println(task.get());
            }

        }

    }
}
