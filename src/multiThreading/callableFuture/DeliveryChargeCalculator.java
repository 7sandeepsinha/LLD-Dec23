package multiThreading.callableFuture;

import java.util.Random;
import java.util.concurrent.Callable;

public class DeliveryChargeCalculator implements Callable {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        Random random = new Random();
        Integer i = random.nextInt();
        System.out.println("Delivery charge : " + i + ",Thread used : " + Thread.currentThread().getName());
        return i;
    }
}
