package com.designprinciples.lecture3.part3.analise;

public class TennisPlayer extends Player {


    public TennisPlayer(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " runs a lot during the game.");
    }

    @Override
    public void defineTactics() {
        System.out.println(name + " utiliza a velocidade como tática.");
        System.out.println();
    }
}
