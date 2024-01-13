package advancedConcepts.exceptionHandling;

public class HelloWorldPrinter {
    public static int a;
    public void print(){
        try {
            Thread.sleep(1000); //Unhandled exception: java.lang.InterruptedException
            System.out.println("Hello world");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }

    public static void helloWorld() throws InterruptedException{ // propagates the exception upwards
        Thread.sleep(100);
        System.out.println("Hello world");
    }

}
// Checked -> which we need to handle [ if we dont handle compiler would throw an error at compile time]
// Unchecked -> which we should handle [ if we dont handle compiler would not throw an error at compile time]
/*
            m1 -> m2 -> m3
            m3 returns something, that is used by m2, and m2 returns something used by m1
 */