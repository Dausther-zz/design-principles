package com.designprinciples.lecture3.part1;

public class PlayerTester {

    public static void main(String[] args) {

        Player tenisPlayer = new TennisPlayer("Tyrion");

        tenisPlayer.train();
        tenisPlayer.compete();
        tenisPlayer.defineTactics();

        Player soccerPlayer = new SoccerPlayer("Ned Stark");

        soccerPlayer.train();
        soccerPlayer.compete();
        soccerPlayer.defineTactics();

    }
}
