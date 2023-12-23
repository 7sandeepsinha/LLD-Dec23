package multiThreading.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++){
            NumberPrinter np = new NumberPrinter(i);
            executorService.submit(np);
        }
    }
}

// default thread names -> Thread-0 to Thread-(N-1)
// ExecutorService -> pool-1-thread-1 to pool-1-thread-N