package InheritanceAndPolymorphism.interfaces;

public class PlayAnimal { //PhonePe
    private IAnimal animal; // IBankAPI

    public PlayAnimal() {
        animal = new Deer(); // ibankAPI = new ICICIBankAPI();
    }

    public void doAnimalThings(){
        animal.walk(); // bankAPI.checkBalance();
        animal.drink(); // bankAPI.register();....
        animal.eat();
    }
}
