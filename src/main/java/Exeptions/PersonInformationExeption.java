package Exeptions;

public class PersonInformationExeption extends IncorrectDataExeption{
    public PersonInformationExeption() {
        super("Please try to change ");
    }

    public PersonInformationExeption(String message) {
        super(message);
    }
}
