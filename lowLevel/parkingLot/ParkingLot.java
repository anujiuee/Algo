package parkingLot;

import parkingLot.constants.VehicleType;

import java.sql.Timestamp;
import java.util.*;

public class ParkingLot {
  private static volatile ParkingLot instance=null;

  Map<String,ParkingSpot> vehicleMap=new HashMap<>();
  Map<Integer,ParkingFloor> floorMap=new HashMap<>();

  private ParkingLot() {
  }


  public static ParkingLot getInstance(){

    if(instance==null){
      synchronized (ParkingLot.class) {
          if (instance==null) instance = new ParkingLot();
          return instance;
      }
    }
    return instance;
  }

  //assign the ticket
  public void assignTicket(String vehicleNumber,VehicleType vehicleType){
    if(!isParkingFull(vehicleType)) return ;
    Ticket ticket = new Ticket(UUID.randomUUID().toString(),new Timestamp(System.currentTimeMillis()));
    Vehicle vehicle = new Vehicle(vehicleNumber,ticket,vehicleType);

    assignParkingSpot(vehicle);
  }

  public int checkoutTicket(String vehicleNumber){


    ParkingSpot parkingSpot = vehicleMap.get(vehicleNumber);
    parkingSpot.isSpotOccupied=false;
    parkingSpot.vehicle=null;
    vehicleMap.remove(vehicleNumber);


    //call price
    return 0;
  }

  private boolean isParkingFull(VehicleType vehicleType){

    return true;
  }

  private void assignParkingSpot(Vehicle vehicle){

    // VehicleType vehicleType = vehicle.vehicleType;

    for (Map.Entry<Integer,ParkingFloor> entry:floorMap.entrySet()){

      for (Map.Entry<Integer,ParkingSpot> entry1:entry.getValue().spotMap.entrySet()){

        ParkingSpot parkingSpot =  entry1.getValue();

        if(!parkingSpot.isSpotOccupied){
          parkingSpot.vehicle=vehicle;
          parkingSpot.isSpotOccupied=true;
          vehicleMap.put(vehicle.vehicleNumber,parkingSpot);
          return;
        }

      }
    }


  }



}
