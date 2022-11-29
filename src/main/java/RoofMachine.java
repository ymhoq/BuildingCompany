import java.util.Objects;

public class RoofMachine extends Instrument{
    private int id;
    private Building lockedBuilding;

    public RoofMachine() {
    }

    public RoofMachine(String name, int count, boolean isFree, int id, Building lockedBuilding) {
        super(name, count, isFree);
        this.id = id;
        this.lockedBuilding = lockedBuilding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        return "RoofMachine ID: " + id + "\n" + super.toString();
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RoofMachine that = (RoofMachine) o;
        return Objects.equals(id, that.id) && Objects.equals(lockedBuilding, that.lockedBuilding);
    }

    @Override
    public final void isReadyToUse() {

    }

    @Override
    public final void isHasPrice() {

    }
}
