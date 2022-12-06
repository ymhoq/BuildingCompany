package Exeptions;

public class PersonEmailExeption extends PersonInformationExeption{
    public PersonEmailExeption() {
        super("unsuitable name email");
    }

    public PersonEmailExeption(String message) {
        super(message);
    }
}
