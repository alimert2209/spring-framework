package com.merthok.spring_framework.game;

public class GameRunner {
    private MarioGame marioGame;
    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;

    }

    public void run() {
        System.out.println("Mario is running!");
        marioGame.down();
        marioGame.up();
        marioGame.right();
        marioGame.left();
    }
}
