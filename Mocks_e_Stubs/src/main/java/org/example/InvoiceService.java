package org.example;

public class InvoiceService {

    // Simula o envio de uma fatura
    public boolean sendInvoice(String email, String invoiceDetails) {
        // Simulando de envio de fatura via email
        if (email == null || email.isEmpty() || invoiceDetails == null || invoiceDetails.isEmpty()) {
            return false; // Falha no envio de fatura
        }
        System.out.println("Fatura enviada para: " + email);
        return true;
    }
}
