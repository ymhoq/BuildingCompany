package BuildProcessItems;

import Buildings.Building;

import java.util.Objects;

public class RoofMachine extends Instrument {
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

    @Override
    public boolean isReadyToUse() {
        if (super.isFree()) return true;
        return false;
    }

    @Override
    public boolean isHasPrice() {
        if (super.getCount() == 0) return false;
        return true;
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

    public int hashCode() {
        int result = 1;
        result = 17 * result + (lockedBuilding == null ? 0 : lockedBuilding.hashCode());
        return result;
    }
}
