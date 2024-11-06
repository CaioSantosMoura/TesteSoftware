package org.example;

public class EmailServiceStub {

    //Método que simula o envio de um email
    public boolean sendEmail(String recipient, String message) {
        // Simulação do envio de email
        return recipient != null && !recipient.isEmpty() && message != null && !message.isEmpty();
    }
}
