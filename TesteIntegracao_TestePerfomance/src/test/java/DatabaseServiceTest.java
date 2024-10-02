import org.example.DatabaseService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseServiceTest {

    private DatabaseService dbService = new DatabaseService();

    @Test
    public void testSimulatedDatabaseConnection() {
        // Simular conexão
        dbService.connect();

        // Simular inserção de suário e verificar sucesso
        boolean insertResult = dbService.insertUser(1, "Alice");
        assertTrue(insertResult, "Falha ao inserir o usuário Alice");

        // Simular inserção de um segundo usuário
        insertResult = dbService.insertUser(2, "Bob");
        assertTrue(insertResult, "Falha ao inserir o usuário Bob");

        // Simular falha ao inserir usuário com ID duplicado
        insertResult = dbService.insertUser(1, "Charlie");
        assertFalse(insertResult, "Deveria falhar ao inserir usuário com ID duplicado");

        // Simular consulta de usuário existente
        String user = dbService.findUserById(1);
        assertEquals("Alice", user, "Usuário com ID 1 deveria ser Alice");

        // Simular consulta de usuário inexistente
        user = dbService.findUserById(3);
        assertNull(user, "Não deveria haver um usuário com ID 3");

        // Simular desconexão
        dbService.disconnect();
    }
}
