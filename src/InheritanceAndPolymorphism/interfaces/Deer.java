package InheritanceAndPolymorphism.interfaces;

public class Deer implements IAnimal{
    public void eat(){
        System.out.println("Deer is eating grass");
    }

    public void drink(){
        System.out.println("Deer is drinking water");
    }

    public void walk(){
        System.out.println("Deer is running");
    }
}
