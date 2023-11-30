package com.company;

public class FoodInADish <T> extends DrawableObj implements Comparable<FoodInADish>{
    private T food;
    private String dishColor;

    FoodInADish(){
        this.food=(T)new Object();
        this.dishColor="white";
    }

    public FoodInADish(T food, String dishColor) {
        super();
        this.food = food;
        this.dishColor = dishColor;
    }


    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public String getDishColor() {
        return dishColor;
    }

    public void setDishColor(String dishColor) {
        this.dishColor = dishColor;
    }

    @Override
    public void draw() {

    }

    @Override
    public int compareTo(FoodInADish o) {
        return 0;
    }
}
