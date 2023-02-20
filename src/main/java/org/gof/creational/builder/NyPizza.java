package org.gof.creational.builder;

import java.util.Objects;

public class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;


    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        public Builder self() {
            return this;
        }
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "size=" + getSize() +
                " toppings=" + getToppings() + '}';
    }


    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
