import java.io.*;
import java.rmi.Remote;
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

    public void promptResult(String result) throws IOException {
        ioController.write(result);
    }

    public double checkResult(int amountDays) {
        Rental rental = new Rental();
        return rental.rent(1, amountDays);

    }

    public void run() throws IOException {
        promptUser();
        int amountDays = Integer.parseInt(getUserInput());
        double totalRent = checkResult(amountDays);
        promptResult("Leihgebühr: " + totalRent);

    }
}
