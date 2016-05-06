package com.designprinciples.lecture3.part3;

public class GamePoint {

    public static void main(String... args) {

        Player tennisPlayer = new TennisPlayer("Tyrion", new Run());

        System.out.println(tennisPlayer.name + " is a tennisPlayer");
        tennisPlayer.train();
        tennisPlayer.compete();
        tennisPlayer.run();
        tennisPlayer.defineTactics();


        Player soccerPlayer = new SoccerPlayer("Ned Stark", new Run());

        System.out.println(soccerPlayer.name + " is a soccerPlayer");
        soccerPlayer.train();
        soccerPlayer.compete();
        soccerPlayer.run();
        soccerPlayer.defineTactics();


        Player cardPlayer = new CardPlayer("Jon Snow");

        System.out.println(cardPlayer.name + " is a cardPlayer");
        cardPlayer.train();
        cardPlayer.compete();
        cardPlayer.run();
        cardPlayer.defineTactics();


        Player chessPlayer = new ChessPlayer("Theon");

        System.out.println(chessPlayer.name + " is a chessPlayer");
        chessPlayer.train();
        chessPlayer.compete();
        chessPlayer.run();
        chessPlayer.defineTactics();


    }
}
