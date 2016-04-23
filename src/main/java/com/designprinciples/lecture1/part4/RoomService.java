package com.designprinciples.lecture1.part4;

/**
 * Created with IntelliJ IDEA.
 * User: Wenderson
 * Date: 4/4/13
 * Time: 6:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class RoomService {
    private Connection connection;

    public RoomService(Connection connection) {
        this.connection = connection;
    }

    public void roomVerification(){
        connection.connect();
        System.out.println("business logic over entity room");
    }
}
