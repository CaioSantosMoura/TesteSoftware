package TesteDeIntegracao;

import TestesDeIntegracao.EmailService;
import TestesDeIntegracao.NotificationService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEmailNotification {

    @Test
    public void testSendNotification() {
        EmailService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);

        boolean result = notificationService.notifyUser("User@example.com", "Sua conta foi atualizado");
        assertTrue(result, "A notificação deveria ser enviada com sucesso");

        result = notificationService.notifyUser("", "Mensagem sem email");
        assertFalse(result, "O envio deveria falhar com email inválido");

        result = notificationService.notifyUser("user@example.com", "");
        assertFalse(result, "O envio deveria falhar com mensagem vazia");
    }
}
