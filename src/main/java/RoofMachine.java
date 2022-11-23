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
}
