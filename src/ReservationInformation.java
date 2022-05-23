import java.time.LocalDate;

public class ReservationInformation {
    private Room room;
    private String clientName;
    private LocalDate reservationStartDate;
    private LocalDate reservationEndDate;
    private double price;


    public ReservationInformation(Room room, String clientName, LocalDate reservationStartDate, LocalDate reservationEndDate, double price) {
        this.room = room;
        this.clientName = clientName;
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationEndDate;
        this.price = price;
    }


    public Room getRoom() {
        return room;
    }

    public String getClientName() {
        return clientName;
    }

    public LocalDate getReservationStartDate() {
        return reservationStartDate;
    }

    public LocalDate getReservationEndDate() {
        return reservationEndDate;
    }

    public double getPrice() {
        return price;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setReservationStartDate(LocalDate reservationStartDate) {
        this.reservationStartDate = reservationStartDate;
    }

    public void setReservationEndDate(LocalDate reservationEndDate) {
        this.reservationEndDate = reservationEndDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

