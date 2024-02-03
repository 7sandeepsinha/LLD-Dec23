package designPatterns.decorator;

//normal addon, always will be added after a base ie. some form of icecream
public class VanillaScoop implements Icecream {
    private Icecream icecream;

    public VanillaScoop(Icecream icecream) {
        this.icecream = icecream;
    }


    @Override
    public int getCost() {
        return icecream.getCost() + 35;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", Vanilla Scoop";
    }
}
