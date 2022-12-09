package Exeptions;

public class PersonAgeExсeption extends PersonInformationExсeption {
    public PersonAgeExсeption() {
        super("Please try to change ");
    }

    public PersonAgeExсeption(String message) {
        super(message);
    }
}
