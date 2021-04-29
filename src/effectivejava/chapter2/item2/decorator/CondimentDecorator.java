package effectivejava.chapter2.item2.decorator;


/**
 * Abstract decorator
 */
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    public abstract String getDescription();


//    public Size getSize() {
//        return beverage.getSize();
//    }


}
