public abstract class SizeSquare {
    private float length;
    private float width;
    public SizeSquare() {

    }
    public SizeSquare(float length, float width) {
      this.length = length;
      this.width = width;
    }

    public float getSquare() {
        return length*width;
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
    public String toString() {
        return "Long is: " + length + "\n" + "Wide is: " + width;
    }
}
