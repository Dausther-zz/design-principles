package com.designprinciples.lecture1.part2;


public class TestConnection {
    public static void main(String... args) {
        RoomService room = new RoomService();
        room.roomVerification();

        ReservationReport res = new ReservationReport();
        res.reportGeneration();

        ReservationService res1 = new ReservationService();
        res1.createReservation();
    }
}
