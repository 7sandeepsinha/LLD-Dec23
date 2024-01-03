package multiThreading.synchronised;

public class MessagePrinter implements Runnable{
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("**************");
            System.out.println("1.Hi");
            System.out.println("2.Hello");
            System.out.println("3.Good morning");
            System.out.println("4.How are you?");
            System.out.println("5.Are you busy?");
            System.out.println("6.Ok Bye!");
            System.out.println("7.Hi!");
            System.out.println("8.How are you?");
            System.out.println("**************");
        }
    }

    public int[] work(){
        return new int[]{1,2};
    }
}
