package com.tw.bootcamp;

public class Rectangle {

    public Float calculate(Float length, Float breath) {
        if (validateInput(length, breath)) {
            return length * breath;
        }
        return null;
    }

    private boolean validateInput(Float length, Float breath) {
        if (null == length && null == breath) {
            throw new IllegalArgumentException("Inputs should not be null");
        } else if (length <= 0.0f || breath <= 0.0f) {
            throw new IllegalArgumentException("Inputs have to be positive numbers");
        }
        return true;
    }
}
