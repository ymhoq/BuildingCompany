package People;

import Enums.Gender;
import Exeptions.IncorrectDataExсeption;

public class Employee extends Person{

    private int salary;
    private int workDays;

    public Employee() {}

    public Employee(String firstName, String lastName, int age, Gender gender, String phoneNumber, String email, int salary, int workDays) throws IncorrectDataExсeption {
        super(firstName, lastName, age, gender, phoneNumber, email);
        this.salary = salary;
        this.workDays = workDays;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public int hashCode() {
        int result = 1;

        result = 17 * result + (super.getLastName() == null ? 0 : super.getLastName().hashCode())
                + (super.getFirstName() == null ? 0 : super.getFirstName().hashCode())
                + (super.getEmail() == null ? 0 : super.getEmail().hashCode());
        return result;
    }
}
