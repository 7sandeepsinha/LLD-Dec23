package polymorphism.methodOverRidding;

public abstract class Car {
    private int numberOfWheels;
    private int enginePower;
    public abstract void startEngine();
}
// some structure -> that allows both abstract method and some attributes
// Interface -> wont work as it does not allow attributes
// Abstract class -> works