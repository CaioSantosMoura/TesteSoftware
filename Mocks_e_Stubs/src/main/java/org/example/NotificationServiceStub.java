package org.example;

public class NotificationServiceStub {

    private EmailServiceStub emailServiceStub;

    public NotificationServiceStub(EmailServiceStub emailServiceStub) {
        this.emailServiceStub = emailServiceStub;
    }

    public boolean notifyUser(String recipient, String notificationMessage) {
        return emailServiceStub.sendEmail(recipient, notificationMessage);
    }
}
