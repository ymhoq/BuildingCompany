package Exeptions;

import java.io.IOException;

public class IncorrectDataExeption extends IOException {
    public IncorrectDataExeption() {
        super("Input data is incorrect!");
    }

    public IncorrectDataExeption(String message) {
        super(message);
    }
}
