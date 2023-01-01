package Enums;

public enum Directions {
    SOUTH("south"), WEST("west"), NORTH("north"), EAST("east");
    private String direction;

    Directions(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
