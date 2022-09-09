public class Pilot extends Staff {
    private String licenseNumber;

    public Pilot(String name, Rank rank, String licenseNumber) {
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
    public String flyPlane(){
        return "We have liftoff everyone";
    }
}
