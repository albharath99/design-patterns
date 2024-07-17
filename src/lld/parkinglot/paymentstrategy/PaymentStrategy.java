package lld.parkinglot.paymentstrategy;

import lld.parkinglot.parkingspot.ParkingSpot;

public interface PaymentStrategy {
    void pay(int amount, ParkingSpot parkingSpot);
}
