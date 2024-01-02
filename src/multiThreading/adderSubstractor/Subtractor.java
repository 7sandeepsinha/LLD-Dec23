package multiThreading.adderSubstractor;

import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Runnable {
    private Count count;
    private ReentrantLock mutex;

    public Subtractor(Count count) {
        this.count = count;
    }

    public Subtractor(Count count, ReentrantLock mutex) {
        this.count = count;
        this.mutex = mutex;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            mutex.lock();
            count.setC(count.getC() - 1);
            mutex.unlock();
        }
    }
}
