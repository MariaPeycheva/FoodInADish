package com.company;

public abstract class DrawableObj {
    private int xCord;
    private int YCord;
    private int width;
    private int height;

    public abstract void draw();

    public DrawableObj() {
        this.xCord = 0;
        this.YCord = 0;
        this.width = 0;
        this.height = 0;
    }

    public DrawableObj(int xCord, int YCord, int width, int height) {
        this.xCord = xCord;
        this.YCord = YCord;
        this.width = width;
        this.height = height;
    }

    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

    public int getYCord() {
        return YCord;
    }

    public void setYCord(int YCord) {
        this.YCord = YCord;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
