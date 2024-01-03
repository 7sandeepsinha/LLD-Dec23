package multiThreading.callableFuture;

import java.util.Random;
import java.util.concurrent.Callable;

public class ProductPriceCalculator implements Callable {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        Integer i = random.nextInt();
        System.out.println("Product price : " + i + ",Thread used : " + Thread.currentThread().getName());
        return i;
    }
}
