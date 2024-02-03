package designPatterns.decorator;

//baseAddon -> it can come as base as well as normal on top of toppings
public class ChocoCone implements Icecream{

    private Icecream icecream;

    public ChocoCone() { // when the cone is the base
    }

    public ChocoCone(Icecream icecream) { // when the cone is being added on top of addons[ice-cream]
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream != null) {
            return icecream.getCost() + 20;
        } else {
            return 20;
        }
    }

    @Override
    public String getDescription() {
        if(icecream != null){
            return icecream.getDescription() + ", Chocolate Cone";
        }else {
            return "Chocolate Cone";
        }
    }
}
