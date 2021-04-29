package effectivejava.chapter2.item2.decorator;


/**
 * Concrete component
 */
public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public int cost() {
        return 2;
    }
}
