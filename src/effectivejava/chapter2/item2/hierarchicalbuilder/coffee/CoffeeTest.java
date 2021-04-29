package effectivejava.chapter2.item2.hierarchicalbuilder.coffee;

public class CoffeeTest {

    public static void main(String[] args) {
        Coffee coffee = new Espresso.Builder(Espresso.Size.SMALL).addDecorator(Coffee.Decorator
                .MILK).addDecorator(Coffee.Decorator.SOY).addDecorator(Coffee.Decorator.MOCHA).build();
        System.out.println(coffee);

        Coffee coffee1 = new HouseBlend.Builder().addDecorator(Coffee.Decorator.MOCHA).build();
        System.out.println(coffee1);
    }
}
