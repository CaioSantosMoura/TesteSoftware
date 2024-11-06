import org.example.InvoiceService;
import org.example.OrderService;
import org.example.PaymentService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Test
    public void testProcessOrderSuccess() {
        // Mock do PaymentService
        PaymentService paymentServiceMock = mock(PaymentService.class);

        // Stub do InvoiceService
        InvoiceService invoiceService = new InvoiceService();

        // Configurar o comportamento do mock para retornar sucesso no pagamento
        when(paymentServiceMock.processPayment("12345", 100.0)).thenReturn(true);

        // Instaciar o OrderService com o mock e o stub
        OrderService orderService = new OrderService(paymentServiceMock, invoiceService);

        // Testar o processamento do pedido
        boolean result = orderService.processOrder("12345", 100.0, "user@example.com");

        // Verificar se o pedido foi processado com sucesso
        assertTrue(result, "O pedido deveria ser processado com sucesso");

        // Verificar se o método de pagamento foi chamado corretamente
        verify(paymentServiceMock).processPayment("12345", 100.0);
    }

    @Test
    public void testProcessOrderFailurePayment() {
        // Mock do PaymentService
        PaymentService paymentServiceMock = mock(PaymentService.class);

        // Stub do InvoiceService
        InvoiceService invoiceServiceStub = new InvoiceService();

        // Configurar o mock para retornar falha no pagamento
        when(paymentServiceMock.processPayment("12345", 100.0)).thenReturn(false);

        // Instaciar o OrderService com o mock e o stub
        OrderService orderService = new OrderService(paymentServiceMock, invoiceServiceStub);

        // Testar o processamento do pedido (deve falhar no pagamento)
        boolean result = orderService.processOrder("12345", 100.0, "user@example.com");

        // Verificar se o pedido falhou devido ao pagamento
        assertFalse(result, "O pedido deveria falhar devido à falha no pagamento");

        // Verificar se o método de pagamento foi chamado corretamente
        verify(paymentServiceMock).processPayment("12345", 100.0);

        // Verificar que o envio de fatura não foi chamado (fatura não deve ser enviada após falha no pagemento)
        verifyNoMoreInteractions(paymentServiceMock);
    }
}
