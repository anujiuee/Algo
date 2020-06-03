package parkingLot;

import parkingLot.constants.VehicleType;

public class Vehicle {
    String vehicleNumber;
    Ticket ticket;
    VehicleType vehicleType;

    public Vehicle(String vehicleNumber, Ticket ticket, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ticket = ticket;
        this.vehicleType = vehicleType;
    }


    public Ticket assignTicket(){
        return null;
    }
}
