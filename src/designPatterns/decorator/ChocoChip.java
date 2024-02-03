package designPatterns.decorator;

//normal addon, always will be added after a base ie. some form of icecream
public class ChocoChip implements Icecream {
    private Icecream icecream;

    public ChocoChip(Icecream icecream) {
        this.icecream = icecream;
    }


    @Override
    public int getCost() {
        return icecream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + ", Chocolate Chip";
    }
}
