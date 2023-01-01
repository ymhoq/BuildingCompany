package People;

import Enums.Gender;
import Exeptions.IncorrectDataExсeption;
import Interfaces.Equipmentable;


public class Builder <T extends Equipmentable> extends Employee {
    private int salary;
    private int lockedBuildingId;

    private T equipment;

    public Builder() {
    }

    public Builder(String firstName, String lastName, int age, Gender gender, String phoneNumber, String email, int salary, int workDays, int lockedBuildingId) throws IncorrectDataExсeption {
        super(firstName, lastName, age, gender, phoneNumber, email, salary, workDays);
        this.salary = salary;
        this.lockedBuildingId = lockedBuildingId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getLockedBuildingId() {
        return lockedBuildingId;
    }

    public void setLockedBuildingId(int lockedBuildingId) {
        this.lockedBuildingId = lockedBuildingId;
    }

    public String toString() {
        return "I working on building Id: " + lockedBuildingId +"\n" + super.toString() +"\n";
    }

    public int hashCode() {
        int result = 1;
        result = 29 * result + (super.getLastName() == null ? 0 : super.getLastName().hashCode())
                + (super.getFirstName() == null ? 0 : super.getFirstName().hashCode())
                + (super.getEmail() == null ? 0 : super.getEmail().hashCode());
        return result;
    }
}
