public class Ground extends SizeSquare {
    private int id;
    private String location;
    private int coeffCount;

    public Ground() {
    }

    public Ground(float length, float width, int id, String location, int coeffCount) {
        super( length, width);
        this.id = id;
        this.location = location;
        this.coeffCount = coeffCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCoeffCount() {
        return coeffCount;
    }

    public void setCoeffCount(int coeffCount) {
        this.coeffCount = coeffCount;
    }

    public String toString() {
        return "Id: " + id + " location" +location + " size:"  + getSquare() + " m2" +"\n";
    }
}
