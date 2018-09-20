import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ApplicationTest {

    private Application application;

    @Mock
    private IOController ioController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        application = new Application(ioController);
    }

    @Test
    public void promptUserForInput() throws IOException {

        // Arrange

        // Act
        application.promptUser();

        // Assert
        verify(ioController).write("Enter rental days");
    }

    @Test
    public void getUserInput() throws IOException {

        // Act
        String input = application.getUserInput();

        // Assert
        verify(ioController).read();
    }

    @Test
    public void promptTotalRent() throws IOException {
        // Act
        application.promptResult("Total rent");

        // Assert
        verify(ioController).write("Total rent");
    }

    @Test
    public void checkTotalRent() throws IOException {
        // Act
        double result = application.checkResult(2);

        // Assert
        assertThat(result).isEqualTo(2.0);
    }

    @Test
    public void applicationCanRunProgSuccessfully() throws IOException {
        //Assume
        when(ioController.read()).thenReturn("3");
        //Act
        application.run();

        //Assert
        verify(ioController).write("Leihgebühr: 3.75");


    }
}
