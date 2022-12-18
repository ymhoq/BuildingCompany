package Enums;

public enum Directions {
    south("south"), west("west"), north("north"), east("east");
    private String direction;

    Directions(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
