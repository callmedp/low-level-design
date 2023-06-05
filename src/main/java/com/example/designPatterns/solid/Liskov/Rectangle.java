package com.example.designPatterns.solid.Liskov;


public class Rectangle {

    protected int height;
    protected int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {

        return width * height;
    }
}
