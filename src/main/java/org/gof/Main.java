package org.gof;

import org.gof.creational.builder.NyPizza;
import org.gof.creational.builder.Pizza;

public class Main {
    public static void main(String[] args) {

        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.SAUSAGE).build();
        System.out.println(pizza);
    }
}