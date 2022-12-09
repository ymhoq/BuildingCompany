package Exeptions;

import java.io.IOException;

public class IncorrectDataExсeption extends IOException {
    public IncorrectDataExсeption() {
        super("Input data is incorrect!");
    }

    public IncorrectDataExсeption(String message) {
        super(message);
    }
}
