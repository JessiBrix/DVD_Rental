import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOController {

    private OutputStream byteArrayOutputStream;
    private InputStream byteArrayInputStream;

    public IOController(OutputStream byteArrayOutputStream, InputStream byteArrayInputStream) {
        this.byteArrayOutputStream = byteArrayOutputStream;
        this.byteArrayInputStream = byteArrayInputStream;
    }

    public void write(String output) throws IOException {
        byteArrayOutputStream.write(output.getBytes());
    }

    public String read() throws IOException {
        return new Scanner(byteArrayInputStream).nextLine();
    }
}
