package com.company;

public class Burger {
    private double burgerPrice;
    private String meatType;
    private String breadType;
    private String cheeseType;
    private int additionalBaconCount = 0;
    private int additionalCheeseCount = 0;
    private int additionalMeatCount = 0;

    public Burger() {
    }

    public Burger(double burgerPrice, String meatType, String breadType, String cheeseType) {
        this.burgerPrice = burgerPrice;
        this.meatType = meatType;
        this.breadType = breadType;
        this.cheeseType = cheeseType;
    }

    public void showIngredients(){
        System.out.println("The bread is " + breadType + ", with " + meatType + " and the cheese is " + cheeseType + ".");
        showAdditionals();
    }

    public void showAdditionals(){
        showCheeseAdditionals();
        showBaconAdditionals();
        showMeatAdditionals();
    }

    public void showBaconAdditionals(){
        if(additionalBaconCount > 0){
            for(int index = 0; index < additionalBaconCount; index++){
                System.out.println("Bacon additional.");
            }
        }
    }

    public void showCheeseAdditionals(){
        if(additionalCheeseCount > 0){
            for(int index = 0; index < additionalCheeseCount; index++){
                System.out.println("Cheese additional.");
            }
        }
    }

    public void showMeatAdditionals(){
        if(additionalMeatCount > 0){
            for(int index = 0; index < additionalMeatCount; index++){
                System.out.println("Meat additional.");
            }
        }
    }

    public double addBacon(){
        additionalBaconCount += 1;
        return burgerPrice = burgerPrice + 1.0;
    }

    public double addCheese(){
        additionalCheeseCount += 1;
        return burgerPrice = burgerPrice + 0.50;
    }

    public double addMeat(){
        additionalMeatCount += 1;
        return burgerPrice = burgerPrice + 5.0;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

}
