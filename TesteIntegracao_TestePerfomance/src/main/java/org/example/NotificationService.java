package org.example;

import org.example.EmailService;

public class NotificationService {

    private EmailService emailService;

    // Construtor que recebe EmailService como dependência
    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    // Simula o envio de uma notificação
    public boolean sendNotification(String userEmail, String message) {
        if (userEmail == null || message == null || message.isEmpty()) {
            return false;
        }
        String subject = "Notificação Importante!";
        return emailService.sendEmail(userEmail, subject, message);
    }
}
