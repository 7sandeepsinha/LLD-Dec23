package advancedConcepts.lambdaStreams;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
