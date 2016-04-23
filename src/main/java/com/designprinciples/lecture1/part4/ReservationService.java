package com.designprinciples.lecture1.part4;

/**
 * Created with IntelliJ IDEA.
 * User: Wenderson
 * Date: 4/4/13
 * Time: 6:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReservationService {

    private Connection connection;

    public ReservationService(Connection connection) {
        this.connection = connection;
    }

    public void createReservation(){
        connection.connect();
        System.out.println("business logic over creation of a reservation");
    }
}
