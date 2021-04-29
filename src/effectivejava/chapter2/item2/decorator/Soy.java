package effectivejava.chapter2.item2.decorator;

public class Soy extends CondimentDecorator{


    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()  + ", Soy";
    }
}
