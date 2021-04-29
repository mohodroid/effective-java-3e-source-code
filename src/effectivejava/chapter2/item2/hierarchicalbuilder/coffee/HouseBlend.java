package effectivejava.chapter2.item2.hierarchicalbuilder.coffee;

public class HouseBlend extends Coffee {


    HouseBlend(Coffee.Builder<?> builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "Espresso with " + decorators;
    }

    public static class Builder extends Coffee.Builder<Builder> {

        @Override
        public Coffee build() {
            return new HouseBlend(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
