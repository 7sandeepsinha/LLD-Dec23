package multiThreading.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Shirt> store;
    private String name;
    private int maxSize;
    private Semaphore semaConsumer;
    private Semaphore semaProducer;

    public Consumer(Queue<Shirt> store, String name, Semaphore semaProducer, Semaphore semaConsumer) {
        this.store = store;
        this.name = name;
        this.maxSize = 5;
        this.semaConsumer = semaConsumer;
        this.semaProducer = semaProducer;
    }

    @Override
    public void run() {
        while(true) {
            try {
                semaConsumer.acquire(); // reduce the count for consumer by 1
                System.out.println("Current size : " + store.size() + ", Removed by consumer : " + name);
                store.remove(); // removes a single shirt from store
                semaProducer.release(); // increase the count for producer by 1
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
