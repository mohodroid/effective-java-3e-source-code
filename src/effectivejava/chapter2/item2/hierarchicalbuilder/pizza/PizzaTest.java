package effectivejava.chapter2.item2.hierarchicalbuilder.pizza;

import static effectivejava.chapter2.item2.hierarchicalbuilder.pizza.Pizza.Topping.*;
import static effectivejava.chapter2.item2.hierarchicalbuilder.pizza.NyPizza.Size.*;

// Using the hierarchical builder (Page 16)
public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        
        System.out.println(pizza);
        System.out.println(calzone);
    }
}
