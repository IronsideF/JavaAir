import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.*;

public class FlightTest {
    Flight myFlight;
    Pilot myPilot;
    CabinCrewMember firstCabCrew;
    CabinCrewMember secondCabCrew;
    CabinCrewMember thirdCabCrew;
    CabinCrewMember fourthCabCrew;
    CabinCrewMember fifthCabCrew;
    CabinCrewMember sixthCabCrew;
    CabinCrewMember seventhCabCrew;
    CabinCrewMember eighthCabCrew;
    Plane myPlane;
    Passenger myPassenger;
    Passenger slyPassenger;
    Passenger flyPassenger;


    @Before
    public void before(){
        myPilot = new Pilot("Kim", Rank.CAPTAIN, "ROSD1261");
        firstCabCrew = new CabinCrewMember("Jimmy", Rank.FIRST_OFFICER);
        secondCabCrew = new CabinCrewMember("Chuck", Rank.FLIGHT_ATTENDANT);
        thirdCabCrew = new CabinCrewMember("Huell", Rank.FLIGHT_ATTENDANT);
        fourthCabCrew = new CabinCrewMember("Howard", Rank.FLIGHT_ATTENDANT);
        fifthCabCrew = new CabinCrewMember("Mike", Rank.FLIGHT_ATTENDANT);
        sixthCabCrew = new CabinCrewMember("Nacho", Rank.FLIGHT_ATTENDANT);
        seventhCabCrew = new CabinCrewMember("Gus", Rank.FLIGHT_ATTENDANT);
        eighthCabCrew = new CabinCrewMember("Lalo", Rank.FLIGHT_ATTENDANT);
        ArrayList<CabinCrewMember> testCrew = new ArrayList<>(Arrays.asList(
                firstCabCrew,
                secondCabCrew,
                thirdCabCrew,
                fourthCabCrew,
                fifthCabCrew,
                sixthCabCrew,
                seventhCabCrew,
                eighthCabCrew));
        myPlane = new Plane(PlaneType.AIRBUSA350);
        myFlight = new Flight(myPilot, testCrew, myPlane, "WF515", "ABQ", "PHX",new Date(1662805894378L));
        myPassenger = new Passenger("Keith", 2);
        slyPassenger = new Passenger("Mar", 1);
        flyPassenger = new Passenger("James", 0);
    }
    @Test
    public void hasProperties(){
        assertEquals(myPilot, myFlight.getPilot());
        assertEquals(8, myFlight.getCrewCount());
        assertEquals(myPlane, myFlight.getPlane());
        assertEquals("WF515", myFlight.getFlightNumber());
        assertEquals("ABQ", myFlight.getDestination());
        assertEquals("PHX", myFlight.getDepartureAirport());
        assertEquals(new Date(1662805894378L), myFlight.getDepartureTime());
    }
    @Test
    public void canGetAvailableSeats(){
        assertEquals(325, myFlight.getAvailableSeats());
    }
    @Test
    public void canBookPassengers(){
        myFlight.bookPassenger(myPassenger);
        assertEquals(1, myFlight.getPassengerCount());
    }
    @Test
    public void availableSeatsUpdates(){
        myFlight.bookPassenger(myPassenger);
        assertEquals(324, myFlight.getAvailableSeats());
    }
    @Test
    public void bookingPassengerAddsFlight(){
        myFlight.bookPassenger(myPassenger);
        assertEquals(myFlight, myPassenger.getFlight());
    }
    @Test
    public void bookingPassengerAddsSeatNumber(){
        myFlight.bookPassenger(myPassenger);
        assertNotEquals(0, myPassenger.getSeatNumber());
    }
    @Test
    public void willNotDoubleBookSeats(){
        Flight smallFlight = new Flight(myPilot, new ArrayList<>(), new Plane(PlaneType.CESSNA172R), "7", "EDI", "GLA", new Date());
        smallFlight.bookPassenger(myPassenger);
        smallFlight.bookPassenger(slyPassenger);
        smallFlight.bookPassenger(flyPassenger);
        assertNotEquals(myPassenger.getSeatNumber(), slyPassenger.getSeatNumber());
        assertNotEquals(myPassenger.getSeatNumber(), flyPassenger.getSeatNumber());
        assertNotEquals(slyPassenger.getSeatNumber(), flyPassenger.getSeatNumber());
    }

}
