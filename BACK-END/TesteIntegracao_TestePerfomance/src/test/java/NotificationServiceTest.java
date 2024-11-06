import org.example.EmailService;
import org.example.NotificationService;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    public void testSendNotification() {
        // Simula o serviço de email
        EmailService emailService = new EmailService();

        // Serviço de notificação usando o serviço email simulado
        NotificationService notificationService = new NotificationService(emailService);

        // Teste de envio bem-sucedido de notificaão
        boolean result = notificationService.sendNotification("User@example.com", "Sua conta foi atualizado");
        assertTrue(result, "A notificação deveria ser enviada com sucesso");

        //Verifica se o email foi enviado corretamente
        assertEquals(1, emailService.getSentEmails().size());
        assertTrue(emailService.getSentEmails().get(0).contains("user@example.com"));

        // Teste de falha ao enviar notificação (email inválido)
        result = notificationService.sendNotification("","Mensagem sem email");
        assertFalse(result, "O envio deveria falhar com email inválido");

        // Teste de falha ao enviar notificação (mensagem vazia)
        result = notificationService.sendNotification("user@example.com", "");
        assertFalse(result, "O envio deveria falhar com mensagem vazia");
    }
}