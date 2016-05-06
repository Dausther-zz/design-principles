package com.designprinciples.lecture3.part3;

public class SoccerPlayer extends Player {

    public SoccerPlayer(String name, Behavior... behavior) {
        super(name, behavior);
    }

    @Override
    public void defineTactics() {
        System.out.println(name + " Utiliza a agilidade como tática.");
        System.out.println();
    }
}
