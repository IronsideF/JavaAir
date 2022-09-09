public class CabinCrewMember extends Staff {
    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }
    public String fastenBeltsMessage(){
        return "The pilot has turned on the fasten seatbelts sign, please ensure your seatbelt is securely fastened";
    }
}
