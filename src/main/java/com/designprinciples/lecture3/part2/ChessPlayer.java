package com.designprinciples.lecture3.part2;

public class ChessPlayer extends Player {

    public ChessPlayer(String name) {
        super(name);
    }

    @Override
    public void defineTactics() {
        System.out.println(name + " utiliza a paciência como tática.");
        System.out.println();
    }
}
