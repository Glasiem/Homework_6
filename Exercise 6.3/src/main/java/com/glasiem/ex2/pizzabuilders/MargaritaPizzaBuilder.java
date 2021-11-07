package com.glasiem.ex2.pizzabuilders;

public class MargaritaPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("Margarita dough");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Margarita sauce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Margarita topping");
    }
}