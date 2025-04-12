package LowLevelDesign.ParkingLot;

import java.util.*;


// Main Controller class
public class ParkingLot {
    List<ParkingSpot> spots;
    Map<String, ParkingSpot> occupiedSpots;

    public ParkingLot(int totalSpots) {
        this.spots = new ArrayList<>();
        this.occupiedSpots = new HashMap<>();
        for(int i=0; i< totalSpots; i++) {
            spots.add(new ParkingSpot(i));
        }
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for(ParkingSpot spot: spots) {
            if(spot.isAvailable()) {
                spot.assignVehicle(vehicle);
                Ticket ticket = new Ticket(UUID.randomUUID().toString(), spot);
                return ticket;
            }
        }
        return null; // no parking avaiable
    }

    public void unParkVehicle(Ticket ticket) {
        ParkingSpot spot =  occupiedSpots.get(ticket.getTicketId());
        if (spot != null) {
            spot.removeVehicle();
            occupiedSpots.remove(ticket.getTicketId());
        }
    }
}
