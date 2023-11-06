package com.tw.bootcamp;

public class Rectangle {

    public Float calculateArea(Float length, Float breath) {
        if (null == length && null == breath) {
            throw new IllegalArgumentException("Inputs should not be null");
        } else if (length <= 0.0f || breath <= 0.0f) {
            throw new IllegalArgumentException("Inputs have to be positive numbers");
        }
        return length * breath;
    }
}
