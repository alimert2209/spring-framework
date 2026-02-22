package com.merthok.spring_framework.game;

public class GameRunner {
    private MarioGame marioGame;
    private SuperContraGame superContraGame;
    private GamingConsole game;

    public GameRunner(GamingConsole game){
        this.game = game;
    }

    public void run() {
        game.down();
        game.up();
        game.right();
        game.left();
    }
}
