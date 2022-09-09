public abstract class Staff {
    private String name;
    private Rank rank;

    public Staff(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }
}
