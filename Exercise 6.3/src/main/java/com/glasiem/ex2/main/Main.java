package com.glasiem.ex2.main;

import com.glasiem.ex2.pizza.Pizza;
import com.glasiem.ex2.pizzabuilders.HawaiianPizzaBuilder;
import com.glasiem.ex2.pizzabuilders.MargaritaPizzaBuilder;
import com.glasiem.ex2.pizzabuilders.PizzaBuilder;
import com.glasiem.ex2.pizzabuilders.SpicyPizzaBuilder;
import com.glasiem.ex2.waiter.Waiter;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        PizzaBuilder margaritaPizzaBuilder = new MargaritaPizzaBuilder();


        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        pizza.info();

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza2 = waiter.getPizza();
        pizza2.info();

        waiter.setPizzaBuilder(margaritaPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza3 = waiter.getPizza();
        pizza3.info();
    }
}
