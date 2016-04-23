package com.designprinciples.lecture1.part4;


public class TestConnection {

    public static void main(String... args) {

        Connection con = new MySQLConnection();

        RoomService room = new RoomService(con);
        room.roomVerification();

        ReservationReport res = new ReservationReport(con);
        res.reportGeneration();

        ReservationService res1 = new ReservationService(con);
        res1.createReservation();
    }
}
