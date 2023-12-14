package polymorphism.methodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5,4);
        c.add(5.5,4.4);
        c.add(5.5,4);
        c.add(4.4,5);
    }
}
