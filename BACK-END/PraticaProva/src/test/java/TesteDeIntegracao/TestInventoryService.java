package TesteDeIntegracao;
import TestesDeIntegracao.InventoryService;
import TestesDeIntegracao.OrderService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TestInventoryService {

    private static InventoryService inventoryService;
    private static OrderService orderService;

    @BeforeAll
    public static void init() {
        inventoryService = new InventoryService();
        orderService = new OrderService(inventoryService);
    }

    @Test
    public void testPlaceOrderSuccess() {
       InventoryService inventoryService = mock(InventoryService.class);
       when(inventoryService.isProductAvailable("ProdutoA", 10)).thenReturn(true);
       OrderService orderService = new OrderService(inventoryService);
       boolean result = orderService.placeOrder("ProdutoA", 10);
       assertTrue(result);
       verify(inventoryService).isProductAvailable("ProdutoA", 10);
    }
}

