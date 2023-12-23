package InheritanceAndPolymorphism.interfaces;

public class Rabbit implements IAnimal{
    public void eat(){
        System.out.println("Rabbit is eating grass and carrots");
    }

    public void drink(){
        System.out.println("Rabbit is drinking water");
    }

    public void walk(){
        System.out.println("Rabbit is hopping");
    }

    public void chill(){
        System.out.println("Rabbit is chilling");
    }
}
