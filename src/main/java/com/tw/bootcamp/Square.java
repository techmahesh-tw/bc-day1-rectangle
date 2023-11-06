package com.tw.bootcamp;

public class Square {

    private final float side;

    public Square(float side) {
        if (side <= 0.0f) {
            throw new IllegalArgumentException("Inputs have to be positive numbers");
        }
        this.side = side;
    }

    public float area() {
        return side * side;
    }

    public float perimeter() {
        return 4 * side;
    }
}
