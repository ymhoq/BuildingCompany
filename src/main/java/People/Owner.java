package People;

import Enums.Gender;
import Exeptions.IncorrectDataExсeption;

import java.util.Objects;

public class Owner extends Person {
    private boolean firstTime;

    public Owner() {
    }
    public Owner(String firstName, String lastName, int age, Gender gender, String phoneNumber, String email) throws IncorrectDataExсeption {
        super(firstName, lastName, age, gender, phoneNumber, email);
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

    public int hashCode() {
        int result = 1;
        result = 29 * result + (super.getLastName() == null ? 0 : super.getLastName().hashCode())
                + (super.getFirstName() == null ? 0 : super.getFirstName().hashCode())
                + (super.getEmail() == null ? 0 : super.getEmail().hashCode());
        return result;
    }
}
