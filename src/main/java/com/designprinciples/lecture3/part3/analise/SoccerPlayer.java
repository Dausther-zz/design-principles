package com.designprinciples.lecture3.part3.analise;

public class SoccerPlayer extends Player {


    public SoccerPlayer(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " runs a lot during the game.");
    }

    @Override
    public void defineTactics() {
        System.out.println(name + " Utiliza a agilidade como tática.");
        System.out.println();
    }
}
