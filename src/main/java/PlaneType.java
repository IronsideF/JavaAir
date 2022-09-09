public enum PlaneType {
    BOEING747(410, 448.0, 12),
    CESSNA172R(3, 1.225, 0),
    AIRBUSA350(325, 280.0, 8);

    private final int capacity;
    private final double totalWeight;
    private final int crew;

    PlaneType(int capacity, double totalWeight, int crew) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
        this.crew = crew;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public int getCrew() {
        return crew;
    }
}
