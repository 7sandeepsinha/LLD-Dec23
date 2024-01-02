package multiThreading.adderSubstractor;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count(0);

        ReentrantLock mutex = new ReentrantLock();

        Adder adder = new Adder(count, mutex);
        Subtractor subtractor = new Subtractor(count, mutex);

        Thread adderThread = new Thread(adder);
        Thread subThread = new Thread(subtractor);

        adderThread.start();
        subThread.start();

        adderThread.join();
        subThread.join();
        System.out.println(count.getC()); // 0, non-zero
    }
}
