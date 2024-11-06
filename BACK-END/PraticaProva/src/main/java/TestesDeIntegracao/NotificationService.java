package TestesDeIntegracao;

public class NotificationService {
    private EmailService emailService;
    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }
    public boolean notifyUser(String recipient, String message) {
        return emailService.sendEmail(recipient, message);
    }
}
