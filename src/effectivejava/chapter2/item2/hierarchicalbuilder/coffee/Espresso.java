package effectivejava.chapter2.item2.hierarchicalbuilder.coffee;

import java.util.Objects;

public class Espresso extends Coffee {

    private Size size;

    Espresso(Espresso.Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return size + " Espresso with " + decorators;
    }

    public enum Size {SMALL, MEDIUM, LARGE}

    public static class Builder extends Coffee.Builder<Builder> {

        private final Size size;

        Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public Coffee build() {
            return new Espresso(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }


}
