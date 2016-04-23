package com.designprinciples.lecture1.part1;

public class ReservationReport {
    private MySQLConnection connection;

    public ReservationReport() {
        connection = new MySQLConnection();
    }

    public void reportGeneration() {
        connection.connect();
        System.out.println("business logic in order to generate a report");
    }
}
