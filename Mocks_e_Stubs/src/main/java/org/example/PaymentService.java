package org.example;

public class PaymentService {

    // Simula o processamento de pagamento
    public  boolean processPayment(String accountNumber, double amount){
        // Simulação de uma lógica complexa de pagamento
        if (accountNumber == null || accountNumber.isEmpty() || amount <= 0){
            return false; // Falha no pagamento
        }
        return true; // Sucesso no pagamento
    }
}
