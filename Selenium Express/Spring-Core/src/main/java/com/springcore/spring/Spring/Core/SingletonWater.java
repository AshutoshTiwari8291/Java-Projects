package com.springcore.spring.Spring.Core;

public class SingletonWater {
    private SingletonWater(){}
    private int waterQuantity = 500;
    private static SingletonWater SingletonWaterObj = null;

    int getWater(int q) {
        waterQuantity-= q;
        return q;
    }

    public static SingletonWater getInstance() {
        if (SingletonWaterObj==null) {
            SingletonWaterObj =  new SingletonWater();
        }
        return  SingletonWaterObj;
    }
}
