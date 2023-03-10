package org.gof.creational.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        public T self() {
            return (T) this;
        }

        abstract Pizza build();
    }

    public Set<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                '}';
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
