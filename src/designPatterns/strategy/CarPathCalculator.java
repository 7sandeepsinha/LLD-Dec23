package designPatterns.strategy;

//PathCalculator cases should be singleton as they dont have any other use case
public class CarPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path via Car from " + source + ", to " + destination);
    }
}
