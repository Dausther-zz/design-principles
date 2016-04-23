package com.designprinciples.lecture1.part2;

/**
 * Created with IntelliJ IDEA.
 * User: Wenderson
 * Date: 4/4/13
 * Time: 6:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReservationService {
    private OracleConnection connection;

    public ReservationService() {
        connection = new OracleConnection();
    }

    public void createReservation(){
        connection.connect();
        System.out.println("business logic over creation of a reservation");
    }
}
