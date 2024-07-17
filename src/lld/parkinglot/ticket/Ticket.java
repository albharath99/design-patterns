package lld.parkinglot.ticket;

import lld.parkinglot.parkingspot.ParkingSpot;

import java.util.Date;

public class Ticket {
    Date start_time;

    public Ticket(Date start_time, ParkingSpot parkingSpot) {
        this.start_time = start_time;
        this.parkingSpot = parkingSpot;
    }

    ParkingSpot parkingSpot;

}
