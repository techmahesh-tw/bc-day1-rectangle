package com.tw.bootcamp;

public class Rectangle {

    private final float length;
    private final float breath;

    public Rectangle(float length, float breath) {
        if (length <= 0.0f || breath <= 0.0f) {
            throw new IllegalArgumentException("Inputs have to be positive numbers");
        }
        this.length = length;
        this.breath = breath;
    }

    public Float area() {
        return length * breath;
    }

    public float perimeter() {
        return (2*length) + (2*breath);
    }
}
