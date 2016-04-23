package com.designprinciples.lecture1.part2;

/**
 * Created with IntelliJ IDEA.
 * User: Wenderson
 * Date: 4/4/13
 * Time: 6:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReservationReport {
    private OracleConnection connection;

    public ReservationReport() {
        connection = new OracleConnection();
    }

    public void reportGeneration(){
        connection.connect();
        System.out.println("business logic in order to generate a report");
    }
}
