package designPatterns.strategy;

public class Main {
    public static void main(String[] args) {
        Maps maps = new Maps();
        maps.findPath("BANGALORE", "PATNA", Mode.BIKE);
    }
}
