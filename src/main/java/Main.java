import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Application application = new Application(new IOController(System.out, System.in));
        application.promptUser();
        String userInput = application.getUserInput();
    }
}
