import org.example.DatabaseUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseUtilsTest {

    private DatabaseUtils dataBaseUtils;

    @BeforeEach
    public void setUp(){
       dataBaseUtils = new DatabaseUtils();
       dataBaseUtils.connect();
    }

    @AfterEach
    public void tearDown(){
        dataBaseUtils.disconnect();
    }

    @Test
    public void testConnection(){
        assertTrue(dataBaseUtils.isConnected());
    }

    @Test
    public void testDisconnectionAfterEach(){
        assertTrue(dataBaseUtils.isConnected());
    }
}
