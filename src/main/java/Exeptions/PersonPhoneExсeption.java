package Exeptions;

public class PersonPhoneExсeption extends PersonInformationExсeption {
    public PersonPhoneExсeption() {
        super("unsuitable phone ");
    }

    public PersonPhoneExсeption(String message) {
        super(message);
    }
}
