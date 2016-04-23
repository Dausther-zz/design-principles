package com.designprinciples.lecture1.part1;

public class RoomService {
    private MySQLConnection connection;

    public RoomService() {
        connection = new MySQLConnection();
    }

    public void roomVerification() {
        connection.connect();
        System.out.println("business logic over entity room");
    }
}
