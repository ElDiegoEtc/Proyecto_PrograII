package logica.command;
import logica.ElementosPizarra;

import logica.Pizarra;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandAddClaseAtributoPizarraTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Pizarra p;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        Pizarra p = new Pizarra(null, null);
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testExecute() {
        ElementosPizarra elementosPizarra = new ElementosPizarra();
        CommandAddClaseAtributoPizarra command = new CommandAddClaseAtributoPizarra(elementosPizarra, p);

        command.execute();
        assertEquals("", outContent.toString().trim());

    }
}
