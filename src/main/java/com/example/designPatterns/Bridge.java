package com.example.designPatterns;

import com.example.designPatterns.bridge.Circle;
import com.example.designPatterns.bridge.Red;

import com.example.designPatterns.bridge.Square;
import com.example.designPatterns.bridge.Yellow;

public class Bridge {

    public void createBridge() {
        Red redColor = new Red();
        Yellow yellowColor = new Yellow();

        Circle redCircle = new Circle(12.5, redColor);
        Circle yellowCircle = new Circle(11.0, yellowColor);

        Square redSquare = new Square(redColor,4.0);

        yellowCircle.draw();
        redSquare.draw();
    }
}
