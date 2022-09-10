import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> crewMembers, Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime) {
        this.pilot = pilot;
        this.crewMembers = crewMembers;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public int getCrewCount(){
        return crewMembers.size();
    }
    public int getPassengerCount(){
        return passengers.size();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }
    public int getAvailableSeats(){
        return plane.getCapacity() - getPassengerCount();
    }
    public void bookPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }
}
