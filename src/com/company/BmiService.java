package com.company;

public class BmiService{
    public static int calculate(int weight, int height, int index) {
        weight = 98;
        height = (int) 1.87;
        index = weight / (height * height);
        return index;
    }
}
