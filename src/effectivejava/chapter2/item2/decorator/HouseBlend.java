package effectivejava.chapter2.item2.decorator;

/**
 * Concrete component
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public int cost() {
        return 2;
    }
}
