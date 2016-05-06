package com.designprinciples.lecture3.part2;

public class CardPlayer extends Player {

    public CardPlayer(String name) {
        super(name);
    }

    @Override
    public void defineTactics() {
        System.out.println(name + " utiliza a calma como tática.");
        System.out.println();
    }
}
