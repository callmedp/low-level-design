package com.example.designPatterns.bridge;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius, Color color) {

        super(color);
        this.radius = radius;
    }

    public void draw() {
        System.out.print("Circle is drawn and " );
        color.paint();
    }
}
