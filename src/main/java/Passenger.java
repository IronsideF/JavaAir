public class Passenger {
    private String name;
    private int bags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
        this.flight = null;
        this.seatNumber = 0;
    }
    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
}
