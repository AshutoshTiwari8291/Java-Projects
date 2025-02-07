package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GameRunner {
	private GamingConsole game;
	
	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running gmae:" + game);
		this.game.up();
		this.game.down();
		this.game.left();
		this.game.right();
	}
}
