package CicloDeVida;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDatabaseConnection {

    private static DatabaseConnection databaseConnection;

    @BeforeAll
    public static void initAll() {
        databaseConnection = new DatabaseConnection();
        System.out.println("Testes iniciados!");
    }

    @BeforeEach
    public void init() {
        databaseConnection.connect();
    }

    @Test
    public void testConnect() {
        assertTrue(databaseConnection.isconectado());
    }

    @Test
    public void testDisconnect() {
        databaseConnection.disconnect();
        assertFalse(databaseConnection.isconectado());
    }

    @AfterEach
    public void mensagem(){
        System.out.println("Teste realizado com sucesso!");
    }


    @AfterAll
    public static void tearDown() {
        System.out.println("Testes finalizados!");
    }

}
