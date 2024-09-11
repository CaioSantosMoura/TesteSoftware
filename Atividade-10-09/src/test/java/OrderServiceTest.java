import org.example.OrderService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class OrderServiceTest {

    private static OrderService orderService;

    @BeforeAll
    public static void setUpAll(){
        System.out.println("inicializando OrderService...");
        orderService = new OrderService();
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Limpando Pedidos Antes de Cada Teste...");
        orderService.clearAllOrders();
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Finalizando Teste...");
    }

    @AfterAll
    public static void tearDownAll(){
        System.out.println("Finalizando Todos os Testes");
        orderService = null;
    }

    @Test
    public void testAddOrder(){
        orderService.addOrder("Pedido 1");
        assertFalse(orderService.getAllOrders().isEmpty());
    }

    @Test
    public void testRemoveOrder(){
        orderService.addOrder("Pedido 2");
        orderService.removeOrder("Pedido 2");
        assertTrue(orderService.getAllOrders().isEmpty());
    }

    @Test
    public void testClearAllOrders(){
        orderService.addOrder("Pedido 3");
        orderService.addOrder("Pedido 4");
        orderService.clearAllOrders();
        assertTrue(orderService.getAllOrders().isEmpty());
    }
}
