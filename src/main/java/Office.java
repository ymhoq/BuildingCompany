import java.util.Objects;

public final class Office extends Building {
     private final float COEFFCOUNT = 1;
    final private float COEFFPROCESS = 1;
    private int workPlaces;

    public Office() {
    }

    public Office(float length, float width, int rooms, int statusReady, int id, int workPlaces) {
        super( length, width, id, rooms, statusReady);
        this.workPlaces = workPlaces;
    }

    public int getWorkPlaces() {
        return workPlaces;
    }

    public void setWorkPlaces(int workPlaces) {
        this.workPlaces = workPlaces;
    }
    public String toString() {
        return  super.toString() + "work places: " + workPlaces + "\n" ;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Office that = (Office) o;
        return  Objects.equals(workPlaces, that.workPlaces) && Objects.equals(this.getId(), that.getId());
    }
}
