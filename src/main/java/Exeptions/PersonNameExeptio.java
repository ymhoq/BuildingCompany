package Exeptions;

public class PersonNameExeptio extends PersonInformationExeption{
    public PersonNameExeptio() {
        super("unsuitable name");
    }

    public PersonNameExeptio(String message) {
        super(message);
    }
}
