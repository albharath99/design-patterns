package lld.parkinglot.terminal;

import lld.parkinglot.parkingspot.ParkingSpot;
import lld.parkinglot.ticket.Ticket;

import java.time.Instant;
import java.util.Date;

public class Terminal {
    public Ticket giveTicketToCustomer(ParkingSpot parkingSpot) {
        return new Ticket(Date.from(Instant.now()), parkingSpot);
    }
}
