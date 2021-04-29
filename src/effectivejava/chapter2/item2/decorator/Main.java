package effectivejava.chapter2.item2.decorator;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        /*
          order and espresso, no condiment
         */
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


	    /*
          order house blend with mocha
         */
        Beverage beverage2 = new Soy(new Mocha(new HouseBlend()));
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
