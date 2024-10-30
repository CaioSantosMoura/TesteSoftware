package org.example;

import java.util.HashMap;
import java.util.Map;

public class BookInventoryService {
    private Map<String, Integer> inventory;

    public BookInventoryService() {
        inventory = new HashMap<>();
        inventory.put("Java Programming", 3);
        inventory.put("Python Fundamentals", 2);
    }

    public boolean isBookAvailable(String title) {
        return inventory.getOrDefault(title, 0) > 0;
    }

    public void lendBook(String title) {
        int currentStock = inventory.getOrDefault(title, 0);
        if (currentStock > 0) {
            inventory.put(title, currentStock - 1);
        } else {
            throw new IllegalArgumentException("Livro indisponível para empréstimo:" + title);
        }
    }
}
