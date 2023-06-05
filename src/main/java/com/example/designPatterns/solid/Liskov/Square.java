package com.example.designPatterns.solid.Liskov;

public class Square extends Rectangle {

    @Override
    public void setHeight(int height) {
        this.height = height;
        width = width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        height = width;
    }
}


// Here we cannot use Rectangle and Square interchangeably.
// setWidth of Square class will change height too, that will break the functionality or contract set by Rectangle.
// One way to fix it is to use an interface Shape and implement calculate in rectangle and square both.