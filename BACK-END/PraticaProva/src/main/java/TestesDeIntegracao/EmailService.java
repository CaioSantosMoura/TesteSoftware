package TestesDeIntegracao;

public class EmailService {
    public boolean sendEmail(String recipient, String message) {
    // Simulação do envio de email
        return recipient != null && !recipient.isEmpty() && message != null && !
                message.isEmpty();
    }
}
