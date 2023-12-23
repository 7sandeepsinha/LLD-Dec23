package polymorphism.methodOverRidding;

public class ICECar extends Car{
    public void startEngine(){
        System.out.println("Consuming petrol/diesel");
        System.out.println("Starting combustion");
        System.out.println("Engine starts");
    }
}
