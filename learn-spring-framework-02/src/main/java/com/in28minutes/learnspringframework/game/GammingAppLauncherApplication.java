package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@Configuration
//public class App03GamingSpringBeans {
//	@Bean
//	public GamingConsole game() {
//		return new PacMan();
//	}
//	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		return new GameRunner(game);
//	}
//
//	public static void main(String[] args) {
//		
//		try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
//			context.getBean(GamingConsole.class).up();
//			context.getBean(GameRunner.class).run();
//		}
//	}
//
//}

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GammingAppLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GammingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}

