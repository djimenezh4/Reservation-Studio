package model;

public class Table {

    public enum Status{
        OPEN, RESERVED, OCCUPIED
    }

    private int tableNumber;
    private int capacity;
    private Status status;

    public Table(int tableNumber, int capacity, Status status){
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.status = status;
    }

    //second constructor for setting up default to open tables

    public Table(int tableNumber, int capacity){
        this(tableNumber, capacity, Status.OPEN);
    }

    //Getters

    public int getTableNumber() {return tableNumber; }
    public int getCapacity() {return capacity; }
    public Status getStatus() {return status;}

    //Setters

    public void setStatus(Status status) { this.status = status; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    //Parse status string from CSV

    public static Status parseStatus(String s) {
        switch (s.trim().toLowerCase()) {
            case "reserved": return Status.RESERVED;
            case "occupied": return Status.OCCUPIED;
            default:        return Status.OPEN;
        }
    }

    @Override
    public String toString() {
        return "Table #" + tableNumber + " | Capacity: " + capacity + " | " + status;
    }
}
