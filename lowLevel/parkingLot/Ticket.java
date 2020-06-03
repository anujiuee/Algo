package parkingLot;

import java.sql.Timestamp;

public class Ticket {
    String ticketId;
    Timestamp timestamp;

    public Ticket(String ticketId, Timestamp timestamp) {
        this.ticketId = ticketId;
        this.timestamp = timestamp;
    }
}
