package com.merthok.spring_framework;

import com.merthok.spring_framework.game.GameRunner;
import com.merthok.spring_framework.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkApplication.class, args);

		MarioGame marioGame = new MarioGame();
		GameRunner gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
