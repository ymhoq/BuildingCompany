package Exeptions;

public class PersonNameExсeption extends PersonInformationExсeption {
    public PersonNameExсeption() {
        super("unsuitable name");
    }

    public PersonNameExсeption(String message) {
        super(message);
    }
}
