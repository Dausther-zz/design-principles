package com.designprinciples.lecture3.part3;

public class CardPlayer extends Player {

    public CardPlayer(String name, Behavior... behavior) {
        super(name, behavior);
    }

    @Override
    public void defineTactics() {
        System.out.println(name + " utiliza a calma como tática.");
        System.out.println();
    }
}
