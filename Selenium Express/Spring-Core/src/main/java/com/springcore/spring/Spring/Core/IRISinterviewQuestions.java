package com.springcore.spring.Spring.Core;

public class IRISinterviewQuestions {


    private void testMethod() {
        System.out.println("Test method");
    }

    public void testMethod(String s) {
        System.out.println("Test method" + s);
    }

    public static void main(String[] args) {
        IRISinterviewQuestions is = new IRISinterviewQuestions();
        is.testMethod();
        is.testMethod("Oh Yeah");
    }
}

