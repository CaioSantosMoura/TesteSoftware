package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmailService {

    private List<String> sentEmails = new ArrayList<>();

    // Simula o envio de um email
    public boolean sendEmail(String to, String subject, String body){
        if(to == null || subject == null || to == body || to.isEmpty()){
            return false;
        }
        String email = "Para: " + to + ", Assunto: " + subject + ", Corpo: " + body;
        sentEmails.add(email);
        System.out.println("Email enviado: " + email);
        return true;
    }

    // Retorna todos os emails enviados

    public List<String> getSentEmails() {
        return sentEmails;
    }
}
