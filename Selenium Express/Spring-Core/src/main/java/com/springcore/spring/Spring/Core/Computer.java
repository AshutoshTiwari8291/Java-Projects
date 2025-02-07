package com.springcore.spring.Spring.Core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    public Computer() {

    }

    @Autowired
    Keyboard keyboard;

    public void start() {
        keyboard.plugIn();
        System.out.println("Computer Started");
    }
}
