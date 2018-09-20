import java.io.*;
import java.util.Scanner;

public class Application {

    private IOController ioController;

    public Application(IOController ioController) {
        this.ioController = ioController;
    }

    public void promptUser() throws IOException {
        ioController.write("Enter rental days");
    }

    public String getUserInput() throws IOException {
        return ioController.read();
    }
}
