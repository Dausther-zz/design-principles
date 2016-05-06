package com.designprinciples.lecture3.part3;

public class ChessPlayer extends Player {

    public ChessPlayer(String name, Behavior... behavior) {
        super(name, behavior);
    }

    @Override
    public void defineTactics() {
        System.out.println(name + " utiliza a paciência como tática.");
        System.out.println();
    }
}
