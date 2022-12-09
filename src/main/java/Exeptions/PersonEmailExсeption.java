package Exeptions;

public class PersonEmailExсeption extends PersonInformationExсeption {
    public PersonEmailExсeption() {
        super("unsuitable name email");
    }

    public PersonEmailExсeption(String message) {
        super(message);
    }
}
