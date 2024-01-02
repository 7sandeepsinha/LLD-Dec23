package multiThreading.executor;

public class NumberPrinter implements Runnable{
    private int i;
    public NumberPrinter(int number) {
        i = number;
    }
    public void run(){
        System.out.println("Number : " + i + ", " + Thread.currentThread().getName()
        + ": Time : " + System.currentTimeMillis());
    }
}

// Synchronisation -> Adder-Subtractor Problem, Mutex, Semaphore, Synchronised keyword
// Callable, Future

// 27, 28, 29 -> Wed, Thurs, Fri
// 24 - 26 Scaler holiday
// 30 -1 Scaler holiday