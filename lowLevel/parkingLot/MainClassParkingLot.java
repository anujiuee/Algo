package parkingLot;

import parkingLot.constants.VehicleType;

public class MainClassParkingLot {

    public static void main(String[] args){
           ParkingLot parkingLot = ParkingLot.getInstance();

           ParkingSpot parkingSpot1 = new ParkingSpot();
           ParkingSpot parkingSpot2 = new ParkingSpot();

           ParkingFloor parkingFloor = new ParkingFloor();

           parkingFloor.spotMap.put(1,parkingSpot1);
           parkingFloor.spotMap.put(2,parkingSpot2);

           parkingLot.floorMap.put(1,parkingFloor);

           parkingLot.assignTicket("123", VehicleType.Bike);
           parkingLot.checkoutTicket("123");
    }

}