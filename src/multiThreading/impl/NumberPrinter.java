package multiThreading.impl;

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
