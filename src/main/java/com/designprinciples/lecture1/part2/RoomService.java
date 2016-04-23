package com.designprinciples.lecture1.part2;

/**
 * Created with IntelliJ IDEA.
 * User: Wenderson
 * Date: 4/4/13
 * Time: 6:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class RoomService {
    private OracleConnection connection;

    public RoomService() {
        connection = new OracleConnection();
    }

    public void roomVerification(){
        connection.connect();
        System.out.println("business logic over entity room");
    }
}
