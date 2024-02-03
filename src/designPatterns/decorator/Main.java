package designPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Icecream ic = new ChocoChip(
                        new ChocoScoop(
                            new OrangeCone(
                                new ChocoSyrup(
                                    new ChocoCone()))));

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
