package multiThreading.synchronised;

import javax.swing.plaf.TableHeaderUI;

public class Main  {
    public static void main(String[] args) {
        MessagePrinter printer1 = new MessagePrinter();
        for( int i : printer1.work()){
            System.out.println(i);
        }

        Thread t1 = new Thread(printer1);
        Thread t2 = new Thread(printer1);
        Thread t3 = new Thread(printer1);
        Thread t4 = new Thread(printer1);
        Thread t5 = new Thread(printer1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
