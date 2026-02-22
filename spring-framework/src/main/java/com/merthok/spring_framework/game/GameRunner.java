package com.merthok.spring_framework.game;

public class GameRunner {
    private MarioGame marioGame;
    private SuperContraGame superContraGame;
    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;

    }

    public GameRunner(SuperContraGame superContraGame) {
        this.superContraGame = superContraGame;
    }

    public void run() {
        System.out.println("Mario is running!");
        superContraGame.down();
        superContraGame.up();
        superContraGame.right();
        superContraGame.left();
    }
}
