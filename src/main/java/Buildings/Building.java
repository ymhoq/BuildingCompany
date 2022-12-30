package Buildings;

import Buildings.SizeSquare;

import java.util.Objects;

public class Building extends SizeSquare {
    private int id;

    private int rooms;

    private int statusReady;

    public Building() {
    }

    public Building(float length, float width, int id, int rooms, int statusReady) {
        super(length, width);
        this.id = id;
        this.rooms = rooms;
        this.statusReady = statusReady;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatusReady() {
        return statusReady;
    }

    public void setStatusReady(int statusReady) {
        this.statusReady = statusReady;
    }

    public String toString() {
        return "Building ID: " + id + "\n";
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Building that = (Building) o;
        return Objects.equals(id, that.id) && this.equals(that);
    }


}
