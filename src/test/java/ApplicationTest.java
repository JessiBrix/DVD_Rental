import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {

    private Application application;
    private IOController ioController;
    private ByteArrayInputStream byteArrayInputStream;
    private ByteArrayOutputStream byteArrayOutputStream;

    @Before
    public void setUp() throws Exception {
        byteArrayInputStream = new ByteArrayInputStream("".getBytes());
        byteArrayOutputStream = new ByteArrayOutputStream();
        ioController = new IOController(byteArrayOutputStream, byteArrayInputStream);
        application = new Application(ioController);
    }

    @Test
    public void promptUserForInput() throws IOException {

        // Arrange

        // Act
        application.promptUser();

        // Assert
        assertThat(byteArrayOutputStream.toString()).isEqualTo("Enter rental days");
    }

    @Test
    public void getUserInput() throws IOException {
        byteArrayInputStream = new ByteArrayInputStream("User input".getBytes());
        ioController = new IOController(byteArrayOutputStream, byteArrayInputStream);
        application = new Application(ioController);

        // Act
        String input = application.getUserInput();

        // Assert
        assertThat(input).isEqualTo("User input");
    }
}
