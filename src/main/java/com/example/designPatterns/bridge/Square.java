package com.example.designPatterns.bridge;

public class Square extends Shape{

    private Double side;

    public Square(Color color, Double side) {
        super(color);
        this.side = side;
    }

    public void draw() {

        System.out.print("Square is drawn and " );
        color.paint();
    }
}
