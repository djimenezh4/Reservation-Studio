package model;

public class Reservation {

    public enum Status{
        RESERVED, SEATED, CANCELLED
    }

    private int reservationNumber;
    private String guestName;
    private int tableNumber;
    private int numberOfGuests;
    private String date; //e.g. "12/4/2023"
    private String timeSlot; //e.g. "1:00 p.m. - 2:00 p.m."
    private Status status;

    public Reservation(int reservationNumber, String guestName, int tableNumber,
                       int numberOfGuests, String date, String timeSlot, Status status) {

        this.reservationNumber = reservationNumber;
        this.guestName = guestName;
        this.tableNumber = tableNumber;
        this.numberOfGuests = numberOfGuests;
        this.date = date;
        this.timeSlot = timeSlot;
        this.status = status;
    }

    //Getters

    public int getReservationNumber() {return reservationNumber; }
    public String getGuestName() {return guestName; }
    public int getTableNumber() {return tableNumber; }
    public int getNumberOfGuests() {return numberOfGuests; }
    public String getDate() {return date; }
    public Status getStatus() {return status; }

    //Setters


    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //Parse status string from CSV

    public static Status parseString(String s){
        switch (s.trim().toLowerCase()) {
            case "seated": return Status.SEATED;
            case "cancelled": return Status.CANCELLED;
            default:           return Status.RESERVED;
        }
    }

    @Override
    public String toString(){
        return "#" + reservationNumber + " | " + guestName +
                " | Table #" + tableNumber +
                " | Party of " + numberOfGuests +
                " | " + date + " " + timeSlot +
                " | " + status;
    }
}
