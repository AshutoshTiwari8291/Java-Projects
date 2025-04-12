package LowLevelDesign.ParkingLot;

public class Ticket {
    private String ticketId;
    private ParkingSpot parkingSpot;

    public Ticket(String ticketId, ParkingSpot parkingSpot) {
        this.ticketId = ticketId;
        this.parkingSpot = parkingSpot;
    }

    public String getTicketId() {
        return ticketId;
    }

}
