package multiThreading.impl;

public class Main {
    public static void main(String[] args) { // -> main thread
//        HelloWorldPrinter hwp = new HelloWorldPrinter(); // task object
//        Thread t = new Thread(hwp); // create a thread for the task object
//        t.start(); // start the thread
//        System.out.println("Hello World : " + Thread.currentThread().getName() + ", Time: " + System.currentTimeMillis());

          for(int i=1;i<=100;i++){
              NumberPrinter np = new NumberPrinter(i);
              Thread t = new Thread(np);
              t.start();
          }
    }
}
