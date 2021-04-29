package effectivejava.chapter2.item2.hierarchicalbuilder.coffee;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

abstract public class Coffee {

     final Set<Decorator> decorators;

    Coffee(Builder<?> builder) {
        decorators = builder.decorators.clone();
    }

    enum Decorator {
        MOCHA, SOY, MILK
    }

    public abstract static class Builder<T extends Builder<T>> {

        private EnumSet<Decorator> decorators = EnumSet.noneOf(Decorator.class);

        public T addDecorator(Decorator decorator) {
            decorators.add(Objects.requireNonNull(decorator));
            return self();
        }

        public abstract Coffee build();

        protected abstract T self();
    }
}
