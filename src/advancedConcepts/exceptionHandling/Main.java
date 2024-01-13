package advancedConcepts.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.divide("10",null);
        c.x = 10;
        c = null;
        // HelloWorldPrinter.helloWorld(); // className.methodName()
        // HelloWorldPrinter.a = 10; // className.attributeName
    }
}
/*
    Why is the main method static ?
    -> Java code starts executing at main method, hence we wont have any object created before the main method executes.
    So, we need to make main method static, so that it can be executed without an object, just with classname.

    What is the difference between final, finally and finalise ?
    -> final keyword -> makes things constant
        final class -> Cannot inherit
        final method -> cannot override
        final attribute -> cant change value

    -> finally  -> block of code that always execute with try or catch, used to clear up resources

    -> finalise -> method for a class, that is called before the objects of that class are destroyed, used for passing messages/logs/cleanup resources.
 */