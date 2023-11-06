package com.tw.bootcamp;

public class Rectangle {


    public Float calculate(Float length, Float breath) {
        if(length <= 0.0f || breath <=0.0f){
            throw new IllegalArgumentException("Inputs have to be positive numbers");
        }
        return length * breath;
    }
}
