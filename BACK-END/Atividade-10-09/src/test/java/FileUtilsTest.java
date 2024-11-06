import org.example.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileUtilsTest {

    private static FileUtils fileUtils;

    @BeforeAll
    public static void setUpAll(){
        fileUtils = new FileUtils();
        fileUtils.openConnection();
    }

    @AfterAll
    public static void tearDownAll(){
        fileUtils.closeConnection();
    }

    @Test
    public void createFile(){
        String fileName = fileUtils.createFile("Prova");
        assertEquals("Prova", fileName); // Verifica se o Arquivo foi Criado
    }

    @Test
    public void deleteFile(){
        boolean deleted = fileUtils.deleteFile("Prova");
        assertTrue(deleted); // Verifica se o Arquivo foi Deletado
    }
}