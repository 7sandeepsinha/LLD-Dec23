package multiThreading.callableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ProductPriceCalculator productPriceCalculator = new ProductPriceCalculator();
        DeliveryChargeCalculator deliveryChargeCalculator = new DeliveryChargeCalculator();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> priceOfProductFuture = executor.submit(productPriceCalculator);
        Future<Integer> deliveryChargeFuture = executor.submit(deliveryChargeCalculator);

        Integer priceOfProduct = priceOfProductFuture.get(); // blocking call  -> blocks the main thread if it does not have the value
        System.out.println("Price of product main - " + priceOfProduct);
        Integer deliveryCharge = deliveryChargeFuture.get(); // blocking call
        System.out.println("Hello world");
        System.out.println("Delivery charge main - " + deliveryCharge);


        System.out.println("Total price : " + (priceOfProduct + deliveryCharge));
    }
}
// error message - Incompatible types: Future is not convertible to Integer