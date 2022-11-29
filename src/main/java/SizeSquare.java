import java.util.Objects;

public abstract class SizeSquare implements ICount{
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

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        SizeSquare that = (SizeSquare) o;
        return Objects.equals(length, that.length) && Objects.equals(width, that.width);
    }
}
