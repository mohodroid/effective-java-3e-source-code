package effectivejava.chapter2.item2.decorator;

/**
 * Concrete decorator
 */
public class Mocha extends CondimentDecorator {

    /**
     * An instance variable to hold a beverage we are wrapping.
     */

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
