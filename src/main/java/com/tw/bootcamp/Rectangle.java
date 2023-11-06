package com.tw.bootcamp;

public class Rectangle {

    private Float length;
    private Float breath;

    public Rectangle(Float length, Float breath) {
        if (null == length && null == breath) {
            throw new IllegalArgumentException("Inputs should not be null");
        } else if (length <= 0.0f || breath <= 0.0f) {
            throw new IllegalArgumentException("Inputs have to be positive numbers");
        }
        this.length = length;
        this.breath = breath;
    }

    public Float area() {
        return length * breath;
    }
}
