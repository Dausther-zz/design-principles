package com.designprinciples.lecture3.part3;

public class TennisPlayer extends Player {


    public TennisPlayer(String name, Behavior... behavior) {
        super(name, behavior);
    }

    @Override
    public void defineTactics() {
        System.out.println(name + " utiliza a velocidade como tática.");
        System.out.println();
    }
}
