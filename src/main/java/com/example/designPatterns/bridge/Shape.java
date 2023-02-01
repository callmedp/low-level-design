package com.example.designPatterns.bridge;

public abstract class Shape {

    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    protected abstract void draw();
}
