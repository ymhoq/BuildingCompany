public class Building extends SizeSquare {
    private int id;
    public Building() {
    }
    public Building(float dlina, float shirina, int id) {
        super(dlina, shirina);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        return "Building ID: " + id + "\n";
    }
}
