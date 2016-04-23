package com.designprinciples.lecture1.part3;

/**
 * Created with IntelliJ IDEA.
 * User: Wenderson
 * Date: 4/4/13
 * Time: 6:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class RoomService {
    private SQLServerConnection connection;

    public RoomService() {
        connection = new SQLServerConnection();
    }

    public void roomVerification(){
        connection.connect();
        System.out.println("business logic over entity room");
    }
}
