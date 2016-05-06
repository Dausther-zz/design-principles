package com.designprinciples.lecture3.part2;

public class PlayerTester {

    public static void main(String[] args) {

        Player cardPlayer = new CardPlayer("Jon Snow");

        cardPlayer.train();
        cardPlayer.compete();
        cardPlayer.defineTactics();

        Player chessPlayer = new ChessPlayer("Theon");

        chessPlayer.train();
        chessPlayer.compete();
        chessPlayer.defineTactics();

        Player tennisPlayer = new TennisPlayer("Tyrion");

        tennisPlayer.train();
        tennisPlayer.compete();
        tennisPlayer.defineTactics();

        Player soccerPlayer = new SoccerPlayer("Ned Stark");

        soccerPlayer.train();
        soccerPlayer.compete();
        soccerPlayer.defineTactics();

    }
}
