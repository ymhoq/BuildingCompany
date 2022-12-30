package Buildings;

import Interfaces.ICount;

import java.util.Objects;

public abstract class SizeSquare  {
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

   // public
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
    public int hashCode() {
        int result = 1;
        result = 29 * result + (length == 0 ? 0 : Float.hashCode(length))
                + (width == 0 ? 0 : Float.hashCode(width));
        return result;
    }

}
