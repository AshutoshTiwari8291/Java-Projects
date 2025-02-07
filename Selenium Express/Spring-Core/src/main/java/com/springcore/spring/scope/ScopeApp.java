package com.springcore.spring.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ScopeApp.class, args);

        ApplicationContext context2 = SpringApplication.run(ScopeApp.class, args);
        School sc = context.getBean(School.class);
        School sc2 = context2.getBean(School.class);

        System.out.println(sc + " and " + sc2);

        System.out.println(sc.getStudent());
        System.out.println(sc.getStudent());
    }
}
