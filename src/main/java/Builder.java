public class Builder extends Person{
    private int salary;
    private int lockedBuildingId;

    public Builder() {
    }

    public Builder(String firstName, String lastName, int age, int phoneNumber, String email, int salary, int lockedBuildingId) {
        super(firstName, lastName, age, phoneNumber, email);
        this.salary = salary;
        this.lockedBuildingId = lockedBuildingId;
    }
    public Builder(Builder builder) {
        super(builder.getFirstName(), builder.getLastName(), builder.getAge(), builder.getPhoneNumber(), builder.getEmail());
        this.salary = builder.getSalary();
        this.lockedBuildingId = builder.getLockedBuildingId();
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
        return "I working on building Id: " + lockedBuildingId + "\n";
    }

    public int hashCode() {
        int result = 1;
        result = 29 * result + (super.getLastName() == null ? 0 : super.getLastName().hashCode())
                + (super.getFirstName() == null ? 0 : super.getFirstName().hashCode())
                + (super.getEmail() == null ? 0 : super.getEmail().hashCode());
        return result;
    }
}
