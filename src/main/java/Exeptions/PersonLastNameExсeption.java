package Exeptions;

public class PersonLastNameExсeption extends PersonInformationExсeption {
    public PersonLastNameExсeption() {
        super("unsuitable lastname");
    }

    public PersonLastNameExсeption(String message) {
        super(message);
    }
}
