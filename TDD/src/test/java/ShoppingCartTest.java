
import org.example.Item;
import org.example.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void testAddItem() {
        cart.addItem(new Item("Produto 1", 10.0));
        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testCalculateTotal() {
        cart.addItem(new Item("Produto 1", 10.0));
        cart.addItem(new Item("Produto 2", 20.0));
        assertEquals(30, cart.calculateTotal());
    }
}
