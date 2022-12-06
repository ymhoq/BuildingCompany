package Exeptions;

public class PersonLastNameExeption extends PersonInformationExeption{
    public PersonLastNameExeption() {
        super("unsuitable lastname");
    }

    public PersonLastNameExeption(String message) {
        super(message);
    }
}
