package org.example;

public class LibraryService {
    private BookInventoryService bookInventoryService;
    public LibraryService(BookInventoryService bookInventoryService) {
        this.bookInventoryService = bookInventoryService;
    }
    public boolean lendBookToUser(String title) {
        if (bookInventoryService.isBookAvailable(title)) {
            bookInventoryService.lendBook(title);
            return true;
        }
        return false;
    }
}
