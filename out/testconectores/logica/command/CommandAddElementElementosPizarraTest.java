package logica.command;
import logica.ElementosPizarra;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandAddElementElementosPizarraTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testExecute() {
        ElementosPizarra elementosPizarra = new ElementosPizarra();
        CommandAddElementElementosPizarra command = new CommandAddElementElementosPizarra(elementosPizarra);

        command.execute();
        assertEquals("", outContent.toString().trim());
    }
}
