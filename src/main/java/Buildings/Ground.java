package Buildings;

import java.util.Objects;

public class Ground <T extends Building> extends SizeSquare {
    private int id;
    private String location;
    private int coeffCount;

    private T buldiding;
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

    public int hashCode() {
        int result = 1;
        result = 29 * result + (super.getLength() == 0 ? 0 : Float.hashCode(super.getLength()))
                + (super.getWidth() == 0 ? 0 : Float.hashCode(super.getWidth()))
                + (id == 0 ? 0 : Integer.hashCode(id));
        return result;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Ground that = (Ground) o;
        return Objects.equals(id, that.id) && Objects.equals(this.getSquare(),that.getSquare());
    }

    @Override
    public void price() {
        super.price();
    }

    @Override
    public void getPrice() {

    }

    public T getBuldiding() {
        return buldiding;
    }

    public void setBuldiding(T buldiding) {
        this.buldiding = buldiding;
    }
}
