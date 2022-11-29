import java.util.Objects;

public class Owner extends Person{
    private boolean firstTime;

    public Owner() {
    }
    public Owner(String firstName, String lastName, int age, int phoneNumber, String email) {
        super(firstName, lastName, age, phoneNumber, email);
    }
    public void setFirstTime(boolean firstTime) {
        this.firstTime = firstTime;
    }

    public boolean getFirstTime() {
        return firstTime;

    }
    public String isFirstTime() {
        if(firstTime) return " is first time";
        else return " is our";
    }

    public String toString() {
        return super.toString()  + isFirstTime() + " owner : "+ "\n";
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Owner that = (Owner) o;
        return Objects.equals(firstTime, that.firstTime) && Objects.equals(this.getLastName(), that.getLastName());
    }
}
