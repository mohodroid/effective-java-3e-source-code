package effectivejava.chapter2.item2.decorator;

/**
 * Abstract component
 */
public abstract class Beverage {

//    public enum Size {SMALL, MEDIUM, LARGE}
//
//    Size size = Size.LARGE;
//
//    public void setSize(Size size) {
//        this.size = size;
//    }
//
//    public Size getSize() {
//        return this.size;
//    }


    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract int cost();


}
