package designPatterns.decorator;

//normal addon, always will be added after a base ie. some form of icecream
public class ChocoSyrup implements Icecream {
    private Icecream icecream;

    public ChocoSyrup(Icecream icecream) {
        this.icecream = icecream;
    }


    @Override
    public int getCost() {
        return icecream.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", Chocolate Syrup";
    }
}
