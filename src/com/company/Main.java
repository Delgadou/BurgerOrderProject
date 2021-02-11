package com.company;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TastyBurger tastyBurger = new TastyBurger();

        tastyBurger.addBacon();
        tastyBurger.addBacon();
        tastyBurger.addCheese();
        tastyBurger.addMeat();

        tastyBurger.showIngredients();
        System.out.println(tastyBurger.getBurgerPrice());
    }
}
