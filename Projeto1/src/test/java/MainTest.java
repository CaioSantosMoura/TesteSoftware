import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    public void testRun(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Main.run();

        System.setOut(originalOut);

        String expectedOutput = "Hello and welcome!" + System.lineSeparator()
                + "i = 1" + System.lineSeparator()
                + "i = 2" + System.lineSeparator()
                + "i = 3" + System.lineSeparator()
                + "i = 4" + System.lineSeparator()
                + "i = 5" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
