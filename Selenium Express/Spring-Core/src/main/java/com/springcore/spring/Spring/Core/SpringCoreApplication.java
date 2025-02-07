package com.springcore.spring.Spring.Core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringCoreApplication {

	@Autowired
	static String sc;

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringCoreApplication.class, args);
//		Computer computer =  container.getBean(Computer.class);
//		computer.start();

		Child c  = new Child();
	}
}
