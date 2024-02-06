package designPatterns.strategy;

public class Maps {
    public void findPath(String source, String destination, Mode mode){
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.findPath(source, destination);
    }
}
// break -> 10:10 PM