package People;

import Buildings.Building;
import Buildings.Catalog;
import Buildings.Ground;
import Enums.Gender;
import Exeptions.IncorrectDataExсeption;
import fi.ISearchSquareGround;

import java.util.Objects;

public class Manager extends Person {
    private int salary;

    public Manager() {
    }
    public Manager(String firstName, String lastName, int age, Gender gender, String phoneNumber, String email, int salary) throws IncorrectDataExсeption {
        super(firstName, lastName, age, gender, phoneNumber, email);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Ground search(Catalog<Ground,Building> catalog, ISearchSquareGround predicate) {
        Ground result = null;
        for(Ground myCatalog : catalog.getGroundList())
        {
            if(predicate.findGround(myCatalog)) {
            result = myCatalog;
            }
        }
    return result;
    }

    public String toString() {
        return super.toString() + " salary : " + salary +  "\n";
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Manager that = (Manager) o;
        return Objects.equals(this.getSalary(), that.salary) && Objects.equals(this.getLastName(), that.getLastName());
    }

    public int hashCode() {
        int result = 1;
        result = 29 * result + (super.getLastName() == null ? 0 : super.getLastName().hashCode())
                + (super.getFirstName() == null ? 0 : super.getFirstName().hashCode())
                + (super.getEmail() == null ? 0 : super.getEmail().hashCode());
        return result;
    }
}
