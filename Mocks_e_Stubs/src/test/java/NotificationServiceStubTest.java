import org.example.EmailServiceStub;
import org.example.NotificationServiceStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceStubTest {

    @Test
    public void testNotifyUserSucess() {
        // Criar um stub de EmailService
        EmailServiceStub emailServiceStub = new EmailServiceStub();

        // Injetar o stub no NotificationService
        NotificationServiceStub notificationServiceStub = new NotificationServiceStub(emailServiceStub);

        // Verificar se a notificação foi enviada com sucesso
        boolean result = notificationServiceStub.notifyUser("user@example.com",
                "Você tem uma nova notificação");
        assertTrue(result, "A notificação deveria ser enviada com sucesso");
    }

    public void testNotifyUserFailure() {
        // Criar um stub de EmailService
        EmailServiceStub emailServiceStub = new EmailServiceStub();

        // Injetar o stub no NotificationService
        NotificationServiceStub notificationServiceStub = new NotificationServiceStub(emailServiceStub);

        // Verificar falha na notificação com destinatário inválido
        boolean result = notificationServiceStub.notifyUser(null,
                "Você tem uma nova notificação");
        assertFalse(result, "A notificação deveria falhar com destinatário inválido");
    }
}
