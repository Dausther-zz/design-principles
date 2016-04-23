package com.designprinciples.lecture1.part1;

public class ReservationService {
    private MySQLConnection connection;

    public ReservationService() {
        connection = new MySQLConnection();
    }

    public void createReservation() {
        connection.connect();
        System.out.println("business logic over creation of a reservation");
    }
}
