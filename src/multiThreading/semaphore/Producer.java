package multiThreading.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Shirt> store;
    private String name;
    private int maxSize;
    private Semaphore semaConsumer;
    private Semaphore semaProducer;

    public Producer(Queue<Shirt> store, String name, int maxSize, Semaphore semaProducer, Semaphore semaConsumer) {
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
        this.semaConsumer = semaConsumer;
        this.semaProducer = semaProducer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                semaProducer.acquire(); // reduce the number for producers by 1
                System.out.println("Current size : " + store.size() + ", Added by producer : " + name);
                store.add(new Shirt());
                semaConsumer.release(); // increase the number for consumer by 1
            }catch (Exception e){
                e.getMessage();
            }
        }
    }
}

// break : 10:22 PM