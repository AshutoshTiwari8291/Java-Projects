package com.springcore.spring.Spring.Core;

public class SingletonWater {
    private SingletonWater(){}
    private int waterQuantity = 500;
    private SingletonWater SingletonWaterObj = null;

    int getWater(int q) {
        waterQuantity-= q;
        return q;
    }

    SingletonWater getInstance() {
        if (SingletonWaterObj==null) {
            SingletonWaterObj =  new SingletonWater();
        }
        return  SingletonWaterObj;
    }
}
