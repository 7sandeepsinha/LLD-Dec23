package InheritanceAndPolymorphism.interfaces;

public class Lion implements IAnimal {
    public void eat(){
        System.out.println("Lion is hunting and eating its prey");
    }

    public void drink(){
        System.out.println("Lion is drinking water");
    }

    public void walk(){
        System.out.println("Lion is running");
    }
}
