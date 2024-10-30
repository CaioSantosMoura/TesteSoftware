import org.example.BookInventoryService;
import org.example.LibraryService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {

    @Test
    public void testLendBookWithAvailableStock() {
        BookInventoryService inventoryService = new BookInventoryService();
        LibraryService libraryService = new LibraryService(inventoryService);
        boolean result = libraryService.lendBookToUser("Java Programming");
        assertTrue(result, "O empréstimo deveria ser realizado com estoque " +
                "disponível");
        // Verificar o estoque após o empréstimo
        assertTrue(inventoryService.isBookAvailable("Java Programming"),
                "Estoque deveria ter ao menos 1 exemplar após o primeiro " +
                        "empréstimo");
    }

    @Test
    public void testLendBookWithNoStock() {
        BookInventoryService inventoryService = new BookInventoryService();
        LibraryService libraryService = new LibraryService(inventoryService);
        // Realizar empréstimos até que o estoque acabe
        libraryService.lendBookToUser("Python Fundamentals");
        libraryService.lendBookToUser("Python Fundamentals");
        boolean result = libraryService.lendBookToUser("Python Fundamentals");
        assertFalse(result,
                "O empréstimo não deveria ser realizado com estoque esgotado");
    }
    @Test
    public void testLendBookForNonExistentTitle() {
        BookInventoryService inventoryService = new BookInventoryService();
        LibraryService libraryService = new LibraryService(inventoryService);
        boolean result = libraryService.lendBookToUser("Non-Existent Book");
        assertFalse(result, "O empréstimo não deveria ser realizado para um " +
                "título inexistente");
    }

}