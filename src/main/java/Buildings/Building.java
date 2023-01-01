package Buildings;

import Buildings.SizeSquare;

import java.util.Objects;

//abstract
public abstract class Building {
    private int id;
    private float length;
    private float width;
    private int rooms;
    private int statusReady;

    public Building() {
    }

    public Building(float length, float width, int id, int rooms, int statusReady) {
        this.length = length;
        this.width = width;
        this.id = id;
        this.rooms = rooms;
        this.statusReady = statusReady;
    }

    public float getSquare() {
        return width*length;
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

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
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
