package Exeptions;

public class PersonAgeExeption extends PersonInformationExeption{
    public PersonAgeExeption() {
        super("Please try to change ");
    }

    public PersonAgeExeption(String message) {
        super(message);
    }
}
