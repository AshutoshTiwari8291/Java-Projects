package com.springcore.spring.Spring.Core;

public class Parent {
    protected  int num= 1;

    Parent() {
        System.out.println("Parent constructor called.");
    }

    Parent(String s) {
        System.out.println("Parent constructor called with string" + s);
    }

    public void foo(){
        System.out.println("Parent class foo!");
    }
}
