package com.springcore.spring.Spring.Core;

public class Child extends Parent {

    private int num = 2;
    StringBuilder sb = new StringBuilder("This is a string builder");
    StringBuffer sbuff = new StringBuffer("THis is a string buffer");
    private int increase_counter = 10;

    Child(){
        System.out.println("Child class default Constructor " + num);
        this.foo();
    }

    public int increase() {
        increase_counter = increase_counter + 1;
        return increase_counter;
    }


    @Override
    public void foo() {
        super.foo();
        SingletonWater water = SingletonWater.getInstance();
        System.out.println("String builder:" + this.sb);
        System.out.println("String buffer:" + this.sbuff);
        increase();
        increase();
        System.out.println("Increment"+ increase_counter);
    }
}
