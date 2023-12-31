package com.company;

public class Fruit extends Food{
    private boolean isReadyToEat = true;

    public Fruit(boolean isReadyToEat) {
        super();
        this.isReadyToEat = isReadyToEat;
    }

    public Fruit(String name, double kg, boolean isReadyToEat) {
        super(name, kg);
        this.isReadyToEat = isReadyToEat;
    }

    public boolean isReadyToEat() {
        return isReadyToEat;
    }

    public void setReadyToEat(boolean readyToEat) {
        isReadyToEat = readyToEat;
    }
}
