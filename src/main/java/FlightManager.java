public class FlightManager {

    public static double getWeightPerPassenger(Flight flight){
        return (flight.getPlane().getTotalWeight()/2)/flight.getPlane().getCapacity();
    }
    public static double getTotalBookedWeight(Flight flight){
        double result = 0.0;
        for (Passenger passenger:flight.getPassengers()){
            result += (passenger.getBags()*0.1);
        }
        return result;
    }
    public static double getRemainingWeight(Flight flight){
        return (flight.getPlane().getTotalWeight()/2)-getTotalBookedWeight(flight);
    }
}
