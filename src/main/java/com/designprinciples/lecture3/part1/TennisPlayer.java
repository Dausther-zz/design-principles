package com.designprinciples.lecture3.part1;

public class TennisPlayer extends Player {

    public TennisPlayer(String name) {
        super(name);
    }

    @Override
    public void defineTactics() {
        System.out.println(name + " utiliza a velocidade como tática.");
        System.out.println();
    }
}
