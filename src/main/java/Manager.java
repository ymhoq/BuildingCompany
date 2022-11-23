public class Manager extends Person{
    private int salary;

    public Manager() {
    }
    public Manager(String firstName, String lastName, int age, int phoneNumber, String email, int salary) {
        super(firstName, lastName, age, phoneNumber, email);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + " salary : " + salary +  "\n";
    }
}
