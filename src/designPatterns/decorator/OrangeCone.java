package designPatterns.decorator;

//baseAddon -> it can come as base as well as normal on top of toppings
public class OrangeCone implements Icecream{

    private Icecream icecream;

    public OrangeCone() { // when the cone is the base
    }

    public OrangeCone(Icecream icecream) { // when the cone is being added on top of addons[ice-cream]
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream != null) {
            return icecream.getCost() + 10;
        } else {
            return 10;
        }
    }

    @Override
    public String getDescription() {
        if(icecream != null){
            return icecream.getDescription() + ", orange Cone";
        }else {
            return "orange Cone";
        }
    }
}
