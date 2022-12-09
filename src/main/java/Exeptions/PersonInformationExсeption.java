package Exeptions;

public class PersonInformationExсeption extends IncorrectDataExсeption {
    public PersonInformationExсeption() {
        super("Please try to change ");
    }

    public PersonInformationExсeption(String message) {
        super(message);
    }
}
