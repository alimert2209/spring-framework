package com.merthok.spring_framework.game;

public class PacmanGame implements GamingConsole{
    /**
     *
     */
    @Override
    public void up() {
        System.out.println("Pacman Up");
    }

    /**
     *
     */
    @Override
    public void down() {
        System.out.println("Pacman down");
    }

    /**
     *
     */
    @Override
    public void right() {
        System.out.println("Pacman right");
    }


    /**
     *
     */
    @Override
    public void left() {
        System.out.println("Pacman left");
    }
}
