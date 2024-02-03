package designPatterns.decorator;

//normal addon, always will be added after a base ie. some form of icecream
public class ChocoScoop implements Icecream {
    private Icecream icecream;

    public ChocoScoop(Icecream icecream) {
        this.icecream = icecream;
    }


    @Override
    public int getCost() {
        return icecream.getCost() + 55;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", Chocolate Scoop";
    }
}
