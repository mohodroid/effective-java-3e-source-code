package effectivejava.chapter2.item2.decorator;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BeverageBuilder {

    final Set<Beverage> beverages;

    private BeverageBuilder(Builder builder) {
        this.beverages = builder.beverages;
    }

    public static class Builder {
        Set<Beverage> beverages = new HashSet<>();

        public Builder addDecorator(Beverage beverage) {
            beverages.add(Objects.requireNonNull(beverage));
            return this;
        }

        public BeverageBuilder build() {
            return new BeverageBuilder(this);
        }
    }

}
