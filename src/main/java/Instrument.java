import java.util.Objects;

public abstract  class Instrument implements Equipmentable{
    private String name;
    private int count;
    private boolean isFree;

    protected Instrument() {
    }
    public Instrument(String name, int count, boolean isFree) {
        this.name = name;
        this.count = count;
        this.isFree = isFree;
    }

    public String isItemFree() {
        if(isFree) return "is free";
        else return "is locked";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public String toString() {
        return "Instrument: " + name + "\n" + isItemFree();
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Instrument that = (Instrument) o;
        return Objects.equals(name, that.name) && Objects.equals(count, that.count) && Objects.equals(isFree, that.isFree);
    }

}
