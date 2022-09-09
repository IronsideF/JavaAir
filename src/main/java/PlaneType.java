public enum PlaneType {
    BOEING747(410, 448.0),
    CESSNA172R(3, 1.225),
    AIRBUSA350(325, 280.0);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
