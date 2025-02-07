package com.springcore.spring.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singletonScope")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SingletonScope {

    public SingletonScope() {
        System.out.println("Prototype initialized");
    }
}
