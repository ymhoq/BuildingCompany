package Exeptions;

public class PersonPhoneExeption extends PersonInformationExeption{
    public PersonPhoneExeption() {
        super("unsuitable phone ");
    }

    public PersonPhoneExeption(String message) {
        super(message);
    }
}
