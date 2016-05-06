package com.designprinciples.lecture3.part1;

public class SoccerPlayer extends Player {

    public SoccerPlayer(String name) {
        super(name);
    }

    @Override
    public void defineTactics() {
        System.out.println(name + " Utiliza a agilidade como tática.");
        System.out.println();
    }
}
